package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
		return List.of(
			new Student(1L, "Ana Veronica", "soporte@anaveronicaparra.com", LocalDate.of(1991, Month.JUNE, 12), 21)
		);
	}
}
