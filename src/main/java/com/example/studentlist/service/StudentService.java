package com.example.studentlist.service;

import com.example.studentlist.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    public List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);

}
