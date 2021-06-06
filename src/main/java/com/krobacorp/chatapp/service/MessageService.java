package com.krobacorp.chatapp.service;


import com.krobacorp.chatapp.model.Message;
import com.krobacorp.chatapp.model.Room;
import com.krobacorp.chatapp.model.User;
import com.krobacorp.chatapp.repository.MessageRepository;
import com.krobacorp.chatapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public Message sendMessage(Message msg){
        try {
            return messageRepository.save(msg);
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
            return null;
        }
    }
    public List<Message> getAllMessages(String roomID){
        try {
            List<Message> messages =  messageRepository.getAllByRoomID(roomID);
            System.out.println("Got messages: "+ messages.toString());
            return messages;
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
            return null;
        }
    }

}
