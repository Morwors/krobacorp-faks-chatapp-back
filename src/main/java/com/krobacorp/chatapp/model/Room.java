package com.krobacorp.chatapp.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class Room {
    @Id
    public String id;

    public List<String> users;

    @CreatedDate
    public Date createdAt;

    public Room() {
    }

    public Room(String id, List<String> users) {
        this.id = id;
        this.users = users;
    }

    public Room(List<String> users) {
        this.users = users;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }
}
