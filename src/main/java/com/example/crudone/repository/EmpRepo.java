package com.example.crudone.repository;

import com.example.crudone.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Emp, Long>{
}
