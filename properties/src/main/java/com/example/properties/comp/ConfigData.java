package com.example.properties.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigData {
	@Value("${server.port}")
	private int port;
	
	@Value("${spring.application.name}")
	private String name;
	
	public String getURL() {
		return "http://localhost:" + port;
	}
	
}
