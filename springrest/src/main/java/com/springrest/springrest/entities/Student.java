package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private long id;
    private String name;
    private Integer roll_number;

    public Student() {
    }
    public Student(long id, String name, Integer roll_number) {
        this.id = id;
        this.name = name;
        this.roll_number = roll_number;
    }
    public Student(String name, Integer roll_number) {
        this.name = name;
        this.roll_number = roll_number;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getRoll_number() {
        return roll_number;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_number(Integer roll_number) {
        this.roll_number = roll_number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roll_number=" + roll_number +
                '}';
    }
}
