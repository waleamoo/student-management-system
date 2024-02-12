package com.techqwerty.studentmanagementsystem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Long id; 
    @NotEmpty(message = "Student first name cannot be empty")
    private String firstName;
    @NotEmpty(message = "Student last name cannot be empty")
    private String lastName;
    @NotEmpty(message = "Student email name cannot be empty")
    @Email
    private String email;
}
