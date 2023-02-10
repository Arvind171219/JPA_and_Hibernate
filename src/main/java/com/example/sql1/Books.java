package com.example.sql1;

import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String name;
    private int page;

    // connecting with Auther calss
    @ManyToOne
    @JoinColumn
    private Auther auther;

    public Auther getAuther() {
        return auther;
    }

    public void setAuther(Auther auther) {
        this.auther = auther;
    }

    public Books(){

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

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
