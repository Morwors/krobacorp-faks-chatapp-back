package com.krobacorp.chatapp.repository;

import com.krobacorp.chatapp.model.Room;
import com.krobacorp.chatapp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;
import java.util.List;


public interface RoomRepository extends MongoRepository<Room, String> {
    public List<Room> findByUsersIn(List<String> users);
//    public User getFirstByUsername(String us)
//    public List<User> findAll();
}
