package com.example.soapclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.soap.model.gen.GetCountryResponse;
import com.example.soapclient.client.CountryClient;

// Cite: https://spring.io/guides/gs/consuming-web-service/
// Cite: https://github.com/spring-guides/gs-consuming-web-service/tree/main/complete

@SpringBootApplication
public class SoapclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapclientApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(CountryClient countryClient) {
		return args -> {
			String country = "Poland";

			/*if (args.length > 0) {
				country = args[0];
			}*/
			System.out.println("++++++++++Request from a client++++++++++");
			GetCountryResponse response = countryClient.getCountry(country);
			System.err.println(response.getCountry().getCapital());
			System.err.println(response.getCountry().getPopulation());
		};
	}
}
