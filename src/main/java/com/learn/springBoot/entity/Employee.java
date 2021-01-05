package com.learn.springBoot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Employee extends Person {

    @Id
    long id;
    String subject;
    LocalDate doj;

    public Employee() {
    }

    public Employee(long id, String name, LocalDate dob, String gender, long id1, String subject, LocalDate doj) {
        super(id, name, dob, gender);
        this.id = id1;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(subject, employee.subject) && Objects.equals(doj, employee.doj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, subject, doj);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", doj=" + doj +
                "} " + super.toString();
    }
}
