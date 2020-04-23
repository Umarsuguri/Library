package com.sogratl.entity;

import javax.persistence.*;

@Entity
@Table(name = "library")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name="name")
    String name;
    @Column(name="address")
    String address;
}
