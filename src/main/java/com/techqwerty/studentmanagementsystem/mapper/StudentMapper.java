package com.techqwerty.studentmanagementsystem.mapper;

import com.techqwerty.studentmanagementsystem.dto.StudentDto;
import com.techqwerty.studentmanagementsystem.entity.Student;

public class StudentMapper {
    public static StudentDto mapToStudentDto(Student student){
        StudentDto studentDto = new StudentDto(
            student.getId(),
            student.getLastName(),
            student.getFirstName(),
            student.getEmail()
        );
        return studentDto;
    }

    public static Student mapToStudent(StudentDto studentDto){
        Student student = new Student(
            studentDto.getId(),
            studentDto.getLastName(),
            studentDto.getFirstName(),
            studentDto.getEmail()
        );
        return student;
    }


}
