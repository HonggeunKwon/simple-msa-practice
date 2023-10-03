package com.example.authservice.app;

import com.example.commonproject.cqs.Bus;
import com.example.commonproject.cqs.Registry;
import com.example.commonproject.cqs.SpringBus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.example.authservice.resource"})
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.example.authservice"})
public class AuthServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServiceApplication.class, args);
    }

    @Bean
    public Registry registry(ApplicationContext applicationContext) {
        return new Registry(applicationContext);
    }

    @Bean
    public Bus bus(Registry registry) {
        return new SpringBus(registry);
    }
}
