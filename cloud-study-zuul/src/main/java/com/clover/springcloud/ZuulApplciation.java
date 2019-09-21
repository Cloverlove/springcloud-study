package com.clover.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplciation {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplciation.class,args);
    }
}
