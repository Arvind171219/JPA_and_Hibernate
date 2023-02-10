package com.example.sql1;

import javax.persistence.*;

@Entity
@Table(name = "library_card")
public class LibararyCard {
    @Id
    private int cardNo;

    private int fine;
    private int bookissue;

    @Enumerated(value = EnumType.STRING) // to store the values in string formate
    private CardStatus cardStatus;

   //child class will have the forgin key of parent class:
    // through which it connect to another tables

    @OneToOne //mapping  relation between the two entity
    @JoinColumn // what are telling: add a forgien key column..--->of the parent colmn,bydeafult its generally its primary key
    User user;

}
