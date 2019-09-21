package com.clover.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicaiton7003 {
    public static void main(String args[]) {
        SpringApplication.run(EurekaApplicaiton7003.class,args);
    }
}
