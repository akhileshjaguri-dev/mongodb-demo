package com.mongodb.controller;

import com.mongodb.entity.Student;
import com.mongodb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/student")
public class StudentController {

private StudentService studentService;


public StudentController(StudentService studentService) {
    this.studentService = studentService;
}

@GetMapping("/health")
public String healthCheck() {
    return "I am working";
}
@PostMapping("/create")
public Student createStudent(@RequestBody Student student) {
    return studentService.createStudent(student);
}

@GetMapping("/getAllStudent")
    public List<Student> getAllstudent() {
    return studentService.getAllStudent();
}
}
