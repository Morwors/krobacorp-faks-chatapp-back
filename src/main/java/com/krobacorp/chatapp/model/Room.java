package com.krobacorp.chatapp.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class Room {
    @Id
    public String id;

    public List<User> users;

    @CreatedDate
    public Date createdAt;

    public Room() {
    }

    public Room(String id, List<User> users) {
        this.id = id;
        this.users = users;
    }

    public Room(List<User> users) {
        this.users = users;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
