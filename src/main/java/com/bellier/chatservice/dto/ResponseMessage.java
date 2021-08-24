package com.bellier.chatservice.dto;


public class ResponseMessage {
	private final String contentMessage;

	public ResponseMessage(String contentMessage) {
		this.contentMessage = contentMessage;
	}

	public String getContentMessage() {
		return contentMessage;
	}
}
