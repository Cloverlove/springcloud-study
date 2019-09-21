package com.clover.springcloud.service;
import com.clover.springcloud.entities.DeptEntity;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 统一处理deptClientService里面的熔断
 * @author Huxudong
 * @date   2019-09-03 18:23:06
 **/
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(DeptEntity deptEntity) {
                return false;
            }

            @Override
            public DeptEntity findById(Long deptNo) {
                return null;
            }

            @Override
            public List findAll() {
                return null;
            }
        };
    }
}
