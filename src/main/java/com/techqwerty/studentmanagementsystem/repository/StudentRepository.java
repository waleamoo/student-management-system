package com.techqwerty.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techqwerty.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
