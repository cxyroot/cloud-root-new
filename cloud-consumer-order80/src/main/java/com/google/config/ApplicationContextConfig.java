package com.google.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced//LoadBalanced 负载均衡策略
    public RestTemplate getRestTemplate() {
        return new RestTemplate();//ribbon
    }
}
//applicationContext.xml <bean id="" class="">
/*
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
    <version>2.2.1.RELEASE</version>
    <scope>compile</scope>
</dependency>
*/