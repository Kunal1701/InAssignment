package com.kunal.assignment.controller;

import com.kunal.assignment.entity.Student;
import com.kunal.assignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    // Get all students
    @RequestMapping(method = RequestMethod.GET, value = "/students")
    public  List<Student> getStudents() {
        return studentService.getStudents();
    }

    // Add a student
    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public void addStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    // Update a student
    @RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
    public void updateStudent(@RequestBody Student student,@PathVariable int id) {
        studentService.updateStudent(id,student);
    }

    // Delete a student
    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }
}
