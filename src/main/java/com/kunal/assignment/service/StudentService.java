package com.kunal.assignment.service;

import com.kunal.assignment.entity.Student;
import com.kunal.assignment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }


    public void updateStudent(int id, Student student) {
        Student student1 = studentRepository.findById(id).get();
        student1.setFirstName(student.getFirstName());
        student1.setLastName(student.getLastName());
        student1.setCourse(student.getCourse());
        student1.setFee(student.getFee());
        studentRepository.save(student1);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
