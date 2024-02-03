package com.example.studentlist.repository;

import com.example.studentlist.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {

    void deleteByEmail(String email);
    Student findStudentByEmail(String email);
}
