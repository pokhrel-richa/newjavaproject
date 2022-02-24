package com.springrest.springrest.service;
import com.springrest.springrest.entities.Student;
import java.util.List;

public interface StudentService {
    public List<Student> getStudent();
    public Student getStudentOne(long studentId);
    public Student addStudent(Student student);
    public Student updateStudent(Student student);
    public void deleteStudent(long parseLong);
}
