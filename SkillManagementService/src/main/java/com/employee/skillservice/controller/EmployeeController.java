package com.employee.skillservice.controller;

import com.employee.skillservice.dataTransferObj.SkillDTO;
import com.employee.skillservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/skills")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "", method = RequestMethod.GET)
    private List<SkillDTO> getAllSkills(){
        return employeeService.getAllSkills();
    }

//    @CrossOrigin(origins = "http://localhost:4200")
//    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
//    private Employee getEmployee(@PathVariable Long id){
//        return employeeService.getEmployeeById(id);
//    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    private void deleteEmployee(@PathVariable Long id){
        employeeService.delete(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    private List<SkillDTO> update(@RequestBody SkillDTO skillDTO) throws Exception {
        return employeeService.saveOrUpdate(skillDTO);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "", method = RequestMethod.POST)
    private List<SkillDTO> save(@RequestBody SkillDTO skillDTO) throws Exception {
        return employeeService.saveOrUpdate(skillDTO);
    }
}
