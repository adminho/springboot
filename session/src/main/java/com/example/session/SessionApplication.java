package com.example.session;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import redis.embedded.RedisServer;

// Cite: https://www.baeldung.com/spring-session
// Cite: https://github.com/eugenp/tutorials/tree/master/spring-web-modules/spring-session/spring-session-redis/src

@SpringBootApplication
public class SessionApplication {
	private RedisServer redisServer;
	
	
	public static void main(String[] args) throws IOException {   
		SpringApplication.run(SessionApplication.class, args);
	}

	@PostConstruct
	public void onconstruce() throws Exception {
	   redisServer = new RedisServer(6379);
	   redisServer.start();    
       System.out.println("Redis Server is starting!");
   }
	
	@PreDestroy
    public void onDestroy() throws Exception {
		redisServer.stop();
        System.out.println("Redis Server is destroyed!");
    }
}
