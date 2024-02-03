package com.example.studentlist.service.impl;

import com.example.studentlist.model.Student;
import com.example.studentlist.repository.InMemStudent;
import com.example.studentlist.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ImplStdService implements StudentService {
    private final InMemStudent repo;


    @Override
    public List<Student> findAllStudent() {
        return repo.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return repo.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repo.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repo.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repo.deleteStudent(email);
    }
}
