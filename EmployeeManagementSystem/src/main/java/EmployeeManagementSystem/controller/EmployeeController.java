package EmployeeManagementSystem.controller;


import EmployeeManagementSystem.dto.EmployeeDTO;
import EmployeeManagementSystem.service.EmployeeService;
import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public void getAll()
    {
        System.out.println("yes");
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="",method = RequestMethod.POST)
    public boolean addEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.addEmployee(employeeDTO);
    }

}
