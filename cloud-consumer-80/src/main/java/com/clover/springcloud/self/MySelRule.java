package com.clover.springcloud.self;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();   // 达到的目的，用我们重新选择的随机算法替代默认的轮询
        //return new Random_hxd();
    }
}
