package com.example.userservice.app;

import com.example.commonproject.cqs.Bus;
import com.example.commonproject.cqs.Registry;
import com.example.commonproject.cqs.SpringBus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.userservice"})
@EnableJpaRepositories(basePackages = {"com.example.userservice.db"})
@EntityScan(basePackages = {"com.example.userservice.domain"}) // com.my.jpa.entity 하위에 있는 @Entity 클래스 scan
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
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
