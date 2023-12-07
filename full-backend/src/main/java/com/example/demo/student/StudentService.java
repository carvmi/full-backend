package com.example.demo.student;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// Business Layer
@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Artemis",
                        "artemis.nature@gmail.com",
                        LocalDate.of(2000, Month.AUGUST, 6),
                        25
                )
        );
    }
}