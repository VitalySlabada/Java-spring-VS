package com.cydeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Employee {

    @Id
    private int ID;
    private String name;


}
