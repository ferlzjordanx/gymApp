package com.example.gymApp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public abstract class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String userName;
    private String userPassword;

    public Person(){}

    public abstract void login();

    public abstract void view();



}
