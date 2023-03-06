package com.google;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class GateWayMain {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain.class, args);
    }
}
