package com.example.jms.comp;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.example.jms.model.Email;

@Component
public class Receiver {

  @JmsListener(destination = "mailbox", containerFactory = "myFactory")
  public void receiveMessage(Email email) {
    System.out.println("Received <" + email + ">");
  }

}