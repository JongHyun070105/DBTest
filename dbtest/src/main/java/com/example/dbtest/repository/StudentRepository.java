package com.example.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dbtest.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    Student findByName(String name);
}