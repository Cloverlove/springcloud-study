package com.clover.springcloud.test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientTest {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig() {
        System.out.println("applicationName:" + this.applicationName+"port:"+this.port);
        return "applicationName:" + this.applicationName;
    }
}
