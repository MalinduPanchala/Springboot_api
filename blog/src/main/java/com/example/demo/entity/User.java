package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")//you can only write "@Table" and JPA will create the table with the class name
public class User {

    @Id
    @GeneratedValue//This is for generate the id automatically by jpa
    private int id;

    @Column(name = "firstname")//adding this above every attribute will rename the column name
    private String fname;

    @Column(name = "lastname")
    private String lname;

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}
