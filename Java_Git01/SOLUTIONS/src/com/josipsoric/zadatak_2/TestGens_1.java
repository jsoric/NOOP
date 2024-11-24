package com.josipsoric.zadatak_2;

import java.util.ArrayList;
import java.util.Collections;

public class TestGens_1 {

    public static void main(String[] args) {
        ArrayList<User> users = popListUsers(10);
        System.out.println("Original list:");
        System.out.println(users);

        shuffleListElements(users);
        System.out.println("Shuffled list:");
        System.out.println(users);
    }



    public static ArrayList<User> popListUsers(int n){
        ArrayList<User> userList = new ArrayList<>();
        for(int i=0; i<=n; i++){
            userList.add(new User());
        }
        return  userList;
    }

    public static <T> void shuffleListElements(ArrayList<T> list){
        Collections.shuffle(list);
    }
}