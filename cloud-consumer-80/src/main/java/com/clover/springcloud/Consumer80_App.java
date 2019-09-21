package com.clover.springcloud;

import com.clover.springcloud.self.MySelRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="CLOVER-DEPT",configuration = MySelRule.class)
public class Consumer80_App {
    public static void main( String[] args ) {
        SpringApplication.run(Consumer80_App.class,args);
    }
}
