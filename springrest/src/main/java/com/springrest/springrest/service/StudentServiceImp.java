package com.springrest.springrest.service;

import com.springrest.springrest.dao.StudentDao;
import com.springrest.springrest.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImp implements StudentService{
//    List<Student> list;
@Autowired
private StudentDao studentDao;

    public StudentServiceImp() {
//        list = new ArrayList<>();
//        list.add(new Student(1, "Richa",34));
//        list.add(new Student(2, "Rucha",35));

    }

    public List<Student> getStudent(){
        return studentDao.findAll();
    }

    @Override
    public Student getStudentOne(long studentId) {
//        Student s = null;
//        for(Student student:list){
//            if(student.getId()==studentId){
//                s = student;
//                break;
//            }
//        }
        return studentDao.getOne(studentId);
    }
    @Override
    public Student addStudent(Student student){
//        list.add(student);
        studentDao.save(student);
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
//        list.forEach(e -> {
//            if(e.getId() == student.getId()){
//                e.setName(student.getName());
//                e.setRoll_number(student.getRoll_number());
//            }
//        });
        studentDao.save(student);
        return student;
    }

    @Override
    public void deleteStudent(long parseLong) {
//        list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
        Student entity = studentDao.getOne(parseLong);
        studentDao.delete(entity);
    }

}
