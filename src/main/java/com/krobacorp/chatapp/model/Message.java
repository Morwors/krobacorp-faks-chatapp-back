package com.krobacorp.chatapp.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Message {
    @Id
    public String id;

    public String message;
    public User sentBy;

    public String roomID;

    @CreatedDate
    public Date createdAt;
//    public String


    public Message(String message, User sentBy, String roomID) {
        this.message = message;
        this.sentBy = sentBy;
        this.roomID = roomID;
    }

    public Message(String id, String message, User sentBy, String roomID, Date createdAt) {
        this.id = id;
        this.message = message;
        this.sentBy = sentBy;
        this.roomID = roomID;
    }

    public Message() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getSentBy() {
        return sentBy;
    }

    public void setSentBy(User sentBy) {
        this.sentBy = sentBy;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

}
