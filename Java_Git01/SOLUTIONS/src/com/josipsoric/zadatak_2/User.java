package com.josipsoric.zadatak_2;

import java.util.UUID;

public class User {

    private static int cntrID = 300;
    private int id;
    private String name;

    public User(){
        this.name = UUID.randomUUID().toString().substring(28) + "_" + cntrID;
        this.id = cntrID;
        cntrID++;
    }

    public int getID(){
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}