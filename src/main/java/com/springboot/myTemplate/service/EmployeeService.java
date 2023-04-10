package com.springboot.myTemplate.service;

import com.springboot.myTemplate.entity.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> findAll();
    EmployeeEntity findById(Long id);
    EmployeeEntity save(EmployeeEntity theEmployeeEntity);
    void deleteById(Long id);

}
