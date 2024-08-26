package com.example.crudone.service;


import com.example.crudone.model.Emp;
import com.example.crudone.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpSerImplement implements EmpService {
    @Autowired
    private EmpRepo empRepo;


    @Override
    public List<Emp> getAllEmp() {
        return empRepo.findAll();
    }

    @Override
    public void saveEmp(Emp emp) {
         empRepo.save(emp);
    }
}
