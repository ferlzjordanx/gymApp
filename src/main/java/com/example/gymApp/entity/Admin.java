package com.example.gymApp.entity;

import lombok.Data;

@Data
public class Admin extends Person{
    String title;

    @Override
    public void login() {

    }

    @Override
    public void view() {

    }

    public boolean addUser(){
        return true;
    }

    public Admin deleteUser(Admin admin){
        return admin;
    }

    public Admin updateUser(Admin admin){
        return admin;
    }
}
