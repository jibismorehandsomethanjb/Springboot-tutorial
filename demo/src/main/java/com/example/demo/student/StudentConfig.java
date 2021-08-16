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
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.dd@mail.com",
                    LocalDate.of(2000, Month.AUGUST,17)
            );

            Student eren = new Student(
                    "Eren",
                    "eren.yg@mail.com",
                    LocalDate.of(1996, Month.JUNE,4)
            );

            repository.saveAll(
                    List.of(mariam, eren)
            );
        };
    }
}
