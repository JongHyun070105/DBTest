package com.example.dbtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbtest.model.Student;
import com.example.dbtest.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired StudentRepository studentRepository;

    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    public List<Student> getAgeOrName(int age, String name){
        return studentRepository.findByAgeOrName(age, name);
    }
}
