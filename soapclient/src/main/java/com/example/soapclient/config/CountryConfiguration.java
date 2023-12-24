package com.example.soapclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import com.example.soapclient.client.CountryClient;

@Configuration
public class CountryConfiguration {

  @Bean
  Jaxb2Marshaller marshaller() {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    // this package must match the package in the <generatePackage> specified in
    // pom.xml
    marshaller.setContextPath("com.example.soap.model.gen");
    return marshaller;
  }

  @Bean
  WebServiceMessageFactory messageFactory()
  {
      SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
      messageFactory.setSoapVersion(SoapVersion.SOAP_11);
      return messageFactory;
  }
  
  @Bean
   CountryClient countryClient(Jaxb2Marshaller marshaller, WebServiceMessageFactory messageFactory) {
    CountryClient client = new CountryClient();
    client.setDefaultUri("http://localhost:8080/ws");
    //client.setMessageFactory(messageFactory);
    client.setMarshaller(marshaller);
    client.setUnmarshaller(marshaller);
    return client;
  }

}