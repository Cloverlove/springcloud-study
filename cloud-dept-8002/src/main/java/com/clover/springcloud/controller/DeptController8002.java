package com.clover.springcloud.controller;
import com.clover.springcloud.service.DeptService;
import com.clover.springcloud.entities.DeptEntity;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Huxudong
 * @date   2019-09-09 19:57:19
 **/
@RestController
public class DeptController8002 {

    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 新增一条部门信息
     * @author Huxd
     * @date   2019-09-07 14:38:10
     * @param  deptEntity   新增的部门的信息
     * @return
     * @throws Exception
     **/
    @ApiOperation(value = "DEPT-ADD-8002",notes = "dpt-8001微服务新增一条部门的信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deptEntity",value = "部门的json数据信息",required = true,dataType = "Object",paramType = "path")
    })
    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean addDept(@RequestBody DeptEntity deptEntity) {
        return   deptService.addDept(deptEntity);
    }

    /**
     * 根据部门id查询部门的信息
     * @author Huxd
     * @date   2019-09-07 14:42:16
     * @param  deptNo   部门id
     * @return
     * @throws Exception
     **/
    @ApiOperation(value = "DEPT-FINDBYID-8002",notes = "根据部门id查询部门信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deptNo",value = "部门的id",required = true,dataType = "String",paramType = "path")
    })
    @RequestMapping(value = "/dept/findById/{deptNo}",method = RequestMethod.GET)
    public DeptEntity findById(@PathVariable("deptNo") Long deptNo) {
        return  deptService.findById(deptNo);
    }

    /**
     * 查询部门的所有的信息
     * @author Huxd
     * @date   2019-09-07 14:43:09
     * @return
     * @throws Exception
     **/
    @ApiOperation(value = "DEPT-FINDALL-8002",notes = "根据部门id查询部门信息")
    @ApiImplicitParams({

    })
    @RequestMapping(value = "/dept/findAll",method = RequestMethod.GET)
    public List<DeptEntity> findAll() {
        return deptService.findAll();
    }

    /**
     * 增加自己服务描述的接口
     * @return
     */
    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println("总共有多少个微服务"+list.size());

        //查询STUDY-SPRINGCLOUD-DEPT 服务
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOVER-DEPT");

        //打印STUDY-SPRINGCLOUD-DEPT服务信息
        for (ServiceInstance element :instances){
            System.out.println(element.getServiceId());
            System.out.println(element.getHost());
            System.out.println(element.getPort());
            System.out.println(element.getUri());
        }
        return this.discoveryClient;

    }

}