package com.clover.springcloud.controller;
import com.clover.springcloud.entities.DeptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
public class DeptController_consumer {
    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://CLOVER-DEPT";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consumer/dept/add")
    public boolean add(DeptEntity dept) {
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping(value="/consumer/dept/get/{deptNo}")
    public DeptEntity get(@PathVariable("deptNo") Long deptNo) {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/findById/"+deptNo,DeptEntity.class);
    }

    @RequestMapping(value="/consumer/dept/list")
    public List<DeptEntity> list() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/findAll",List.class);
    }

}
