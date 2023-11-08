package com.example.spring.demotest.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Employee {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    private String name;

    private Integer age;

    @Temporal(TemporalType.DATE)
    private Date date;


}
