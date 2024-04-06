package com.example.reactiveweb.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest(HomeController.class)
public class HomeControllerTest {
	//cite: https://howtodoinjava.com/spring-boot2/testing/webfluxtest-with-webtestclient/

	@Autowired
	private WebTestClient webClient;

	@Test
	public void myTest() {

		webClient.get().uri("/days").exchange().expectStatus().isOk();
	}
}
