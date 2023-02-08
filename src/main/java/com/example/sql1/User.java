package com.example.sql1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // tabhi to pata chalega kiska table create karna hain  hibberbate ko
@Table(name="user_info") // ye simple table ka name diy hain
public class User {
    @Id // ye btayega ki primary key kown banega
    private int id; //it is the primary key
    private String name;
    private String age;
    private int mobilenumber;

    public User(){

    }

    //always create constractor
    public User(int id, String name, String age,int mobilenumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobilenumber=mobilenumber;
    }

    // always creat getter and setter

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(int mobilenumber) {
        this.mobilenumber = mobilenumber;
    }
}
