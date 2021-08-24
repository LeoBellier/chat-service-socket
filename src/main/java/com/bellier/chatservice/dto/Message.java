package com.bellier.chatservice.dto;

import lombok.Getter;

@Getter
public class Message {
	public Message(String messageContent) {
		this.messageContent = messageContent;
	}

	private final String messageContent;

	public String getMessageContent() {
		return messageContent;
	}

}
