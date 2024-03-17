package com.example.reactiveweb;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.example.reactiveweb.controller.EmployeeController;
import com.example.reactiveweb.controller.HomeController;
import com.example.reactiveweb.dao.EmployeeRepository;

@WebFluxTest(HomeController.class)
public class HomeControllerTests {
	//https://howtodoinjava.com/spring-boot2/testing/webfluxtest-with-webtestclient/

	@Autowired
	private WebTestClient webClient;

	@Test
	public void myTest() {

		webClient.get().uri("/days").exchange().expectStatus().isOk();
	}
}
