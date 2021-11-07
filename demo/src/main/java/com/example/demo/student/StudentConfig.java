package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
           Student ana = new Student("Ana Veronica", "soporte@anaveronicaparra.com", LocalDate.of(1991, Month.JUNE, 12));
           Student marco = new Student("Marco Antonio", "marcoantonio@marbust.com", LocalDate.of(1996, Month.AUGUST, 6));

           repository.saveAll(List.of(ana, marco));
        };
    }
}
