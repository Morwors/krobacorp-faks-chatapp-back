package com.krobacorp.chatapp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.krobacorp.chatapp.model.Room;
import com.krobacorp.chatapp.model.User;
import com.krobacorp.chatapp.model.UserList;
import com.krobacorp.chatapp.service.RoomService;
import com.krobacorp.chatapp.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import com.fasterxml.jackson.core.type.TypeReference;
@CrossOrigin
@RestController
@RequestMapping("/room")
public class RoomController {
//    private UserRepository userRepository;
    private final RoomService roomService;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping("/create")
    public Room createRoom(@ModelAttribute() Room room) {
        System.out.println("Got room: " + room.getUsers().toString());
        return roomService.createRoom(room);
    }

    @PostMapping("/findRoom")
    public String findRoom(@RequestBody() List<User> users) {
        List<String> usernames = new ArrayList<>();
        for(User user: users){
            usernames.add(user.getUsername());
            System.out.println("Got user:"+ user.getUsername());;
        }
        String roomID = roomService.findRoom(usernames);
        System.out.println("Returning room id");
        System.out.println("RoomID returning: "+roomID);
        return roomID;
    };



}