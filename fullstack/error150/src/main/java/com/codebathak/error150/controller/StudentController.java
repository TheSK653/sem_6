package com.codebathak.error150.controller;

import com.codebathak.error150.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/students")
    public StudentDto getStudents() {
        return new StudentDto(31L, "Soham", "TheSK@gmail.com");
    }
}
