package com.josipsoric.zadatak_3;

public class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Username: " + username + "\nEmail: " + email;
    }
}
