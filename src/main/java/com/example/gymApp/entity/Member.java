package com.example.gymApp.entity;

import lombok.Data;

@Data
public class Member extends Person{
    boolean active;
    double fee;

    @Override
    public void login() {

    }

    @Override
    public void view() {

    }

    public void makePayment(){

    }
}
