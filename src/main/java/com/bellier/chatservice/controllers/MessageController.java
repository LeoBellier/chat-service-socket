package com.bellier.chatservice.controllers;

import com.bellier.chatservice.dto.Message;
import com.bellier.chatservice.dto.ResponseMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/message")
    public ResponseMessage getMessage(final Message message){
        return null;
    }
}
