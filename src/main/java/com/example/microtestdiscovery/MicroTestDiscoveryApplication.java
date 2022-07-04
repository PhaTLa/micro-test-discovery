package com.example.microtestdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroTestDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroTestDiscoveryApplication.class, args);
    }

}
