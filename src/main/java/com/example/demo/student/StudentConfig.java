package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JANUARY;
import static java.util.Calendar.OCTOBER;

@Configuration
public class StudentConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return args -> {
//            Student akbar = new Student(
//                    "Akbar",
//                    LocalDate.of(1994, 10, 7),
//                    "akbaryahputralubis@gmail.com"
//            );
//
//            Student hani = new Student(
//                    "Hani",
//                    LocalDate.of(1995, 11, 10),
//                    "hani@gmail.com"
//            );
//
//            repository.saveAll(
//                    List.of(akbar, hani)
//            );
//        };
//    }
}
