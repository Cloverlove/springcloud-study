package com.clover.springcloud.controller;

import com.clover.springcloud.entities.DeptEntity;
import com.clover.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CloudFeignController {
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(DeptEntity dept) {
        return deptClientService.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{deptNo}")
    public DeptEntity get(@PathVariable("deptNo")Long deptNo) {
        return deptClientService.findById(deptNo);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<DeptEntity>  list() {
        return deptClientService.findAll();
    }
}
