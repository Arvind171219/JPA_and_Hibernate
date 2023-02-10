package com.example.sql1;


import javax.persistence.*;

@Entity
@Table(name = "auther")
public class Auther {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int bookwritten;

    private String country;

    private int age;

    public Auther(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookwritten() {
        return bookwritten;
    }

    public void setBookwritten(int bookwritten) {
        this.bookwritten = bookwritten;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
