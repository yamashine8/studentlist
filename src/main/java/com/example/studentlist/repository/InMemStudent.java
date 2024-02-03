package com.example.studentlist.repository;

import com.example.studentlist.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
@Repository
public class InMemStudent {
    private final List<Student> STUDENTS = new ArrayList<>();

    public List<Student> findAllStudent() {
        return STUDENTS;
    }

    public Student saveStudent(Student student) {
        STUDENTS.add(student);
        return student;
    }

    public Student findByEmail(String email) {
        return STUDENTS .stream()
                .filter(element -> element.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public Student updateStudent(Student student) {
        var stdIndex = IntStream.range(0, STUDENTS.size())
                .filter(index -> STUDENTS.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if(stdIndex > -1){
            STUDENTS.set(stdIndex,student);
            return null;
        }
        return null;
    }

    public void deleteStudent(String email) {
        var student = findByEmail(email);
        if(student != null){
            STUDENTS.remove(student);
        }

    }
}
