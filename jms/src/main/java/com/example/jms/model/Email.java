package com.example.jms.model;

import lombok.Data;

@Data
public class Email {

	private String to;
	private String body;

	public Email() {
	}

	public Email(String to, String body) {
		this.to = to;
		this.body = body;
	}

}
