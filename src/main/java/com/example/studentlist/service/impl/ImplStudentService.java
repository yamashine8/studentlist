package com.example.studentlist.service.impl;

import com.example.studentlist.model.Student;
import com.example.studentlist.repository.StudentRepo;
import com.example.studentlist.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class ImplStudentService implements StudentService {

    private final StudentRepo repo;
    @Override
    public List<Student> findAllStudent() {
        return repo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repo.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repo.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repo.save(student);
    }

    @Override
    public void deleteStudent(String email) {
        repo.deleteByEmail(email);
    }
}
