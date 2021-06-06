package com.krobacorp.chatapp.service;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.krobacorp.chatapp.model.Room;
import com.krobacorp.chatapp.model.User;
import com.krobacorp.chatapp.repository.RoomRepository;
import com.krobacorp.chatapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;

    public String findRoom(List<User> users){
        try {
            System.out.println("Got array: "+users.toString());
            List<Room> rooms = roomRepository.findByUsersIn(Collections.singleton(users));
            System.out.println("Found room/s");
            if(rooms.size()!=0){
                System.out.println("Room already exists");
                return rooms.get(0).getId();
            }else{
                return createRoom(new Room(users)).getId();
            }
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
            return null;
        }
    }
    public Room createRoom(Room room){
        try {
            return roomRepository.save(room);
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
            return null;
        }
    }



}
