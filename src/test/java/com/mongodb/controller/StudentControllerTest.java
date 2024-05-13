package com.mongodb.controller;

import com.mongodb.entity.Student;
import com.mongodb.service.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class StudentControllerTest {

    @Mock
    private StudentService studentService;

    @InjectMocks
    private StudentController studentController;

    @DisplayName("Test Create Student")
    @Test
    void createStudent() {
        Student student = new Student();
        student.setName("Akki");
        student.setEmail("abc@gmail.com");

        given(studentController.createStudent(student)).willReturn(student);

        Student response = studentController.createStudent(student);

        assertThat(student.getName()).isEqualTo(response.getName());
    }

    @Test
    void getAllstudent() {
        Student student1 = new Student();
        student1.setName("Akki");
        student1.setEmail("abc@gmail.com");

        Student student2 = new Student();
        student2.setName("Akki");
        student2.setEmail("abc@gmail.com");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        given(studentController.getAllstudent()).willReturn(students);

        List<Student> response = studentController.getAllstudent();

        assertThat(response).hasSize(2);

    }
}