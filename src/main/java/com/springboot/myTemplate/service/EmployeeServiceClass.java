package com.springboot.myTemplate.service;

import com.springboot.myTemplate.entity.EmployeeEntity;
import com.springboot.myTemplate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeServiceClass implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceClass(EmployeeRepository theEmployeeRepository) {
        this.employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<EmployeeEntity> findAll(){
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeEntity findById(Long id){
        Optional<EmployeeEntity> result = employeeRepository.findById(id);
        EmployeeEntity theEmployeeEntity = null;
        if(result.isPresent()){
            theEmployeeEntity = result.get();
        }
        return theEmployeeEntity;
    }

    @Override
    public EmployeeEntity save(EmployeeEntity theEmployeeEntity){
        return employeeRepository.save(theEmployeeEntity);
    }

    @Override
    public void deleteById(Long id){
        employeeRepository.deleteById(id);
    }
}
