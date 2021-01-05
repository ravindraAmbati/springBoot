package com.learn.springBoot.entity;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Student extends Person {

    long id;
    String grade;
    LocalDate doj;

    public Student() {
    }

    public Student(long id, String name, LocalDate dob, String gender, long id1, String grade, LocalDate doj) {
        super(id, name, dob, gender);
        this.id = id1;
        this.grade = grade;
        this.doj = doj;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(grade, student.grade) && Objects.equals(doj, student.doj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, grade, doj);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", grade='" + grade + '\'' +
                ", doj=" + doj +
                "} " + super.toString();
    }
}
