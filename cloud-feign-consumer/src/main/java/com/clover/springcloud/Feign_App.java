package com.clover.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.clover.springcloud"})
@ComponentScan("com.clover.springcloud")
public class Feign_App {
    public static void main(String args[]) {
        SpringApplication.run(Feign_App.class,args);
    }
}
