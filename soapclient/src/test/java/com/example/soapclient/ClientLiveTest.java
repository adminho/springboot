package com.example.soapclient;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.soap.model.gen.Currency;
import com.example.soap.model.gen.GetCountryResponse;
import com.example.soapclient.client.CountryClient;

import jakarta.xml.soap.SOAPException;

// Cite: https://www.baeldung.com/spring-soap-web-service

@SpringBootTest
//@ContextConfiguration(classes = CountryClientConfig.class, loader = AnnotationConfigContextLoader.class)
public class ClientLiveTest {

    @Autowired
    CountryClient client;

    @Test
    public void givenCountryService_whenCountryPoland_thenCapitalIsWarsaw() throws SOAPException {
        GetCountryResponse response = client.getCountry("Poland");        
        assertEquals("Warsaw", response.getCountry().getCapital());
    }

    @Test
    public void givenCountryService_whenCountrySpain_thenCurrencyEUR() throws SOAPException {
        GetCountryResponse response = client.getCountry("Spain");
        assertEquals(Currency.EUR, response.getCountry().getCurrency());
    }
}