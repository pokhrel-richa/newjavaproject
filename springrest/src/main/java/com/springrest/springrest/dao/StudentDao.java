package com.springrest.springrest.dao;

import com.springrest.springrest.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Long> {


}