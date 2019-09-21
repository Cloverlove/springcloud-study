package com.clover.springcloud.controller;
import com.clover.springcloud.entities.DeptEntity;
import com.clover.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService = null;
    @PostMapping(value="/dept/add")
    public boolean add(@RequestBody DeptEntity dept) {
        return deptService.add(dept);
    }

    @GetMapping(value = "/dept/get/{deptNo}")
    @HystrixCommand(fallbackMethod = "processhystrix_Get")
    public DeptEntity get(@PathVariable("deptNo") Long deptNo) {
        DeptEntity deptEntity = deptService.get(deptNo);
        if(null == deptEntity) {
            throw new RuntimeException("sorry"+deptNo+"can not find your data");
        }
        return deptEntity;
    }

    @GetMapping(value="/dept/list")
    public List<DeptEntity> list() {
        return deptService.list();
    }

   /* public DeptEntity processhystrix_Get(@PathVariable("deptNo") Long deptNo) {
        return new DeptEntity().setDname("wow没有对应的信息");

    }*/
}
