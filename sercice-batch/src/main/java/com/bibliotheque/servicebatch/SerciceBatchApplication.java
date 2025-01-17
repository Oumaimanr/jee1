package com.bibliotheque.servicebatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class SerciceBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SerciceBatchApplication.class, args);
    }

}
