package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Student;
import com.springrest.springrest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/home")
    public String home() {
        return "This is home page";
    }
    //get students
    @GetMapping("/student")
    public List<Student> getStudent(){
return this.studentService.getStudent();
    }
    //get single student
    @GetMapping("/student/{studentId}")
    public Student getStudentOne(@PathVariable String studentId){
        return this.studentService.getStudentOne(Long.parseLong(studentId));
    }
    //add student
    @PostMapping(path = "/student", consumes = "application/json")
    public Student addStudent(@RequestBody Student student){
        return this.studentService.addStudent(student);
    }
    //update course using PUT request
    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student){
        return this.studentService.updateStudent(student);
    }
    //delete the course
    @DeleteMapping("/student/{studentId}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String studentId){
        try {
            this.studentService.deleteStudent(Long.parseLong(studentId));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        }
    }



