package com.krobacorp.chatapp.controller;

import com.google.gson.Gson;
import com.krobacorp.chatapp.model.Message;
import com.krobacorp.chatapp.model.Room;
import com.krobacorp.chatapp.model.User;
import com.krobacorp.chatapp.service.MessageService;
import com.krobacorp.chatapp.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/message")
public class MessageController {
    //    private UserRepository userRepository;
    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/getAll")
    public List<Message> getAllMessages(@ModelAttribute(name = "roomID") String roomID) {
        System.out.println("Getting messages: "+ roomID);
        return messageService.getAllMessages(roomID);
    }

    @PostMapping("/send")
    public Message sendMessage(@ModelAttribute() Message message, @ModelAttribute(name = "sentBy") String sentBy) {
        Gson gson = new Gson();
        User user = gson.fromJson(sentBy, User.class);
        message.setSentBy(user);
        System.out.println("Got message data: " + message.getSentBy());
        return messageService.sendMessage(message);
    }

}