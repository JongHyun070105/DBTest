package com.example.dbtest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.dbtest.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    List<Student> findByName(String name);

    // @Query("SELECT p FROM STUDENT p WHERE p.age== :age OR p.name = :name")
    // List<Student> findByAgeOrName(@Param("age") int age, @Param("name") String name);
}