package com.example.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.beans.model.Lion;
import com.example.beans.model.Tiger;

/*
The latest version of the Spring framework defines 6 types of scopes:
singleton
prototype
request
session
application
websocket
 */

// Cite: https://www.tutorialspoint.com/spring_boot/spring_boot_beans_and_dependency_injection.htm
@Configuration
class AnnotationConfig {

    @Bean(name = {"tiger", "kitty"})
    @Scope(value = "prototype")
    Tiger getTiger(String name) {
        return new Tiger(name);
    }

    @Bean(name = "lion") // default scope is singleton
    Lion getLion() {
        return new Lion("Hardcoded lion name");
    }
    
    interface Animal {}
}