package com.krobacorp.chatapp.model;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    public String id;


    public String email;
    public String username;
    public String password;

    public User(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public User() {
    }
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public User(String id, String email, String username, String password) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    //    public User(String id, String email, String username) {
//        this.id = id;
//        this.email = email;
//        this.username = username;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
