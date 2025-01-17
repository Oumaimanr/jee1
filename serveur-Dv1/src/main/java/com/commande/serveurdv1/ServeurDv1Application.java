package com.commande.serveurdv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServeurDv1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServeurDv1Application.class, args);
    }

}
