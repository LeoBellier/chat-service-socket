package com.bellier.chatservice.services;

import com.bellier.chatservice.dto.ResponseMessage;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class WSService {
	private final SimpMessagingTemplate messagingTemplate;

	public WSService(SimpMessagingTemplate messagingTemplate) {
		this.messagingTemplate = messagingTemplate;
	}

	public void notifyFrontend(String messageContent) {
		ResponseMessage response = new ResponseMessage(messageContent);

		messagingTemplate.convertAndSend("/topic/messages", response);

	}

	public void notifyUser(String id, String messageContent) {
		ResponseMessage response = new ResponseMessage(messageContent);

		messagingTemplate.convertAndSendToUser(id, "/topic/private-messages", response);

	}
}
