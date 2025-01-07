package com.example.dbtest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dbtest.model.Student;
import com.example.dbtest.repository.StudentRepository;


@Controller
public class UserController {

    @Autowired StudentRepository studentRepository;

    @GetMapping("/")
    public String index(Model model){
        
        return "index";
    }
    @GetMapping("/insert")
    @ResponseBody
    public String insert( Model model){
        // studentRepository.save( new Student(null,"홍길동",20)); //student table insert
        studentRepository.save( new Student(null,"이순신",30)); //student table insert

        return "수정됨";
    }

    @GetMapping("/select")
    public String select( Model model){
        List<Student> students = studentRepository.findAll(); 
        model.addAttribute("students",students);
        return "select";
    }
    
    @GetMapping("/find")
    public String find( Model model){
        Student std = studentRepository.findByName("홍길동");
        model.addAttribute("std", std);
        return "find";
    }
}
