package com.example.Nestdigital.boot.controller;

import com.example.Nestdigital.boot.Model.Employee;
import com.example.Nestdigital.boot.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


    @RestController
    public class EmployeeController {
        @Autowired
        private EmployeeDao dao;
        @PostMapping("/")
        public String Addpage(){
            return "Welcome to my Add page";
        }
        @CrossOrigin(origins = "*")
        @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
        public Map<String,String> AddEmployees(@RequestBody Employee e){
            System.out.println(e.getId());
            System.out.println(e.getEmpcode());
            System.out.println(e.getEmpname());
            System.out.println(e.getDesignation());
            System.out.println(e.getSalary());
            dao.save(e);
            HashMap<String,String> map=new HashMap<>();
            map.put("status","success");
            return map;
        }
        @CrossOrigin(origins = "*")
        @GetMapping("/view")
        public List<Employee> ViewAll(){
            return (List<Employee>)dao.findAll();
        }
        @CrossOrigin(origins = "*")
        @PostMapping("/search")
        public String Search(){
            return "search my page";
        }
        @CrossOrigin(origins = "*")
        @PostMapping("/delete")
        public String delete(){
            return "delete my page";
        }
    }

