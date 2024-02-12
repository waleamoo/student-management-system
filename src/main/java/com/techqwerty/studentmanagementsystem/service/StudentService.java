package com.techqwerty.studentmanagementsystem.service;

import java.util.List;

import com.techqwerty.studentmanagementsystem.dto.StudentDto;

import jakarta.validation.Valid;

public interface StudentService {
    List<StudentDto> getAllStudents();
    void createStudent(StudentDto studentDto);
    StudentDto getStudentById(Long studentId);
    void updateStudent(StudentDto student);
    void deleteStudentById(Long studentId);
}
