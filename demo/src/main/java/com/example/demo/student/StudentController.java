package com.example.demo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= "api/v1/student")
public class StudentController {

    private final StudentService studentService;


    //https://youtu.be/9SGDpanrc8U?t=1969
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
	public List<Student> getStudents() {
        return studentService.getStudents();
	}
}
