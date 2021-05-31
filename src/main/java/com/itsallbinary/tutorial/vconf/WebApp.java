package com.itsallbinary.tutorial.vconf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class WebApp {

    public static void main(String[] args) {
        final SpringApplication app = new SpringApplication(WebApp.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8082"));
        app.run(args);
    }

}
