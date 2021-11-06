package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> getStudents() {
		return List.of(
			new Student(1L, "Ana Veronica", "soporte@anaveronicaparra.com", LocalDate.of(1991, Month.JUNE, 12), 21)
		);
	}
}
