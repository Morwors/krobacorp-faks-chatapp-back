package com.krobacorp.chatapp.controller;



import com.krobacorp.chatapp.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.util.HtmlUtils;

import org.springframework.stereotype.Controller;

@CrossOrigin
@Controller
public class MessageSocketController {

    @MessageMapping("/room/{roomID}")
    public String greeting(@DestinationVariable String roomID, String message) throws Exception {
        System.out.println("Got message:"+message);
        return message;
    }
}
