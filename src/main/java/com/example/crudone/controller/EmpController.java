package com.example.crudone.controller;


import com.example.crudone.model.Emp;
import com.example.crudone.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/new")
    public String viewHome(Model model){
        System.out.println("hello");
        model.addAttribute("listEmployees",empService.getAllEmp());
        return "index";
    }
    @GetMapping("/templates/addEmp")
    public String Addform(Model model){
        System.out.println("yes");
        return "addEmp";
    }
    @PostMapping("/adduser")
    public String AddEmp(@ModelAttribute("user")Emp emp){
        System.out.println(emp.getFirstName());
        System.out.println(emp.getLastName());
        //empService.saveEmp(emp);
        return "index";
    }

}
