package com.example.crudone.service;


import com.example.crudone.model.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmpService {
    List<Emp>getAllEmp();
    void saveEmp(Emp emp);
}
