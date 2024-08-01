package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student edward = new Student(
                    "Edward",
                    LocalDate.of(2000, Month.NOVEMBER,5),
                    "m932012@gmail.com"
            );
            Student michael = new Student(
                    "Michael",
                    LocalDate.of(1980, Month.NOVEMBER,11),
                    "m932015@gmail.com"
            );
            repository.saveAll(
                    List.of(edward,michael)
            );
        };
    }
}
