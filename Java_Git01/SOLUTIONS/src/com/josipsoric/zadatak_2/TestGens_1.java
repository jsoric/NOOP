package com.josipsoric.zadatak_2;

import java.util.ArrayList;

public class TestGens_1 {

    public static void main(String[] args) {
    ArrayList<User> users = popListUsers(10);
    System.out.println(users);

    }



    public static ArrayList<User> popListUsers(int n){
        ArrayList<User> userList = new ArrayList<>();
        for(int i=0; i<=n; i++){
            userList.add(new User());
        }
        return  userList;
    }
}
