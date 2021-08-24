package com.bellier.chatservice.controllers;

import com.bellier.chatservice.dto.Message;
import com.bellier.chatservice.services.WSService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WSController {
	private final WSService service;

	public WSController(WSService service) {
		this.service = service;
	}

	@PostMapping("/send-message")
	public void sendMessage(@RequestBody final Message message) {
		service.notifyFrontend(message.getMessageContent());
	}

	@PostMapping("/send-private-message/{id}")
	public void sendPrivateMessage(@PathVariable final String id,
								   @RequestBody final Message message) {
		service.notifyUser(id, message.getMessageContent());
	}

}
