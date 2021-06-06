package com.krobacorp.chatapp.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class UserList {

    public List<User> users;


    public UserList(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
