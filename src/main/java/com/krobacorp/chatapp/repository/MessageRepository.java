package com.krobacorp.chatapp.repository;

import com.krobacorp.chatapp.model.Message;
import com.krobacorp.chatapp.model.Room;
import com.krobacorp.chatapp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface MessageRepository extends MongoRepository<Message, String> {
    public List<Message> getAllByRoomID(String room);
//    public Message
//    public User getFirstByUsername(String us)
//    public List<User> findAll();
}
