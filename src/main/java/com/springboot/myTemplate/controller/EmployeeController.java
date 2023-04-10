package com.springboot.myTemplate.controller;

import com.springboot.myTemplate.entity.EmployeeEntity;
import com.springboot.myTemplate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
//(origins = "https://localhost:4200")

@RequestMapping("/api/v1")
public class EmployeeController {
    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService theEmployeeService) {
        this.employeeService = theEmployeeService;
    }

    @GetMapping("/employees")
    public List<EmployeeEntity> getAllEmployees(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public EmployeeEntity getEmployee(@PathVariable Long id){
        EmployeeEntity theEmployeeEntity = employeeService.findById(id);

        if(theEmployeeEntity == null){
            throw new RuntimeException("Employee id not found -" + id);
        }
        return theEmployeeEntity;
    }

    @PostMapping("/employees")
    public EmployeeEntity addEmployee(@RequestBody EmployeeEntity theEmployeeEntity){
        theEmployeeEntity.setId(0L);
        EmployeeEntity employee = employeeService.save(theEmployeeEntity);
        return employee;
    }

    @PutMapping("/employees/{id}")
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity theEmployeeEntity){
        EmployeeEntity dbUser = employeeService.save(theEmployeeEntity);
        return dbUser;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        EmployeeEntity employee = employeeService.findById(id);
        if(employee == null){
            throw new RuntimeException("Employee id not found: " + id);
        }
        employeeService.deleteById(id);
        return "Delete employee id: " + id;
    }


}
