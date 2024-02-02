package com.example.changeport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Cite: https://www.baeldung.com/spring-boot-change-port

@SpringBootApplication
@RestController
public class ChangeportApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChangeportApplication.class, args);
	}

	@GetMapping("/")
	public String getGreeting() {
		return "Hello, World!";
	}
		
}

/*
  
Basically, the configurations priority is

1) embedded server configuration

2) command-line arguments
java -jar changeport-0.0.1-SNAPSHOT.jar --server.port=8083

or by using the equivalent syntax:
java -jar -Dserver.port=8083 changeport-0.0.1-SNAPSHOT.jar

3) property files
server.port=8081

4) main @SpringBootApplication configuration

@SpringBootApplication
public class CustomApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CustomApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "8083"));
        app.run(args);
    }
}

หรือจะใช้วิธี
@Component
public class ServerPortCustomizer 
  implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
 
    @Override
    public void customize(ConfigurableWebServerFactory factory) {
        factory.setPort(8086);
    }
}
*/ 
 
