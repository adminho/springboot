package com.example.logging;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;


// Cite: https://www.baeldung.com/spring-boot-logging
// Cite: https://www.tutorialspoint.com/spring_boot/spring_boot_logging.htm
@SpringBootApplication
@Slf4j
public class LoggingApplication {

	//private static final Logger logger = LoggerFactory.getLogger(LoggingApplication.class);

	public static void main(String[] args) {
		log.trace("A TRACE Message");
		log.debug("A DEBUG Message");
		log.info("An INFO Message");
		log.warn("A WARN Message");
		log.error("An ERROR Message");

		SpringApplication.run(LoggingApplication.class, args);
	}

}
