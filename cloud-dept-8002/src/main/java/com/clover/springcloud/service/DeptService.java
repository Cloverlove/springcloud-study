package com.clover.springcloud.service;

import com.clover.springcloud.entities.DeptEntity;

import java.util.List;
/**
 *
 * @author Huxudong
 * @date   2019-09-09 19:59:41
 **/
public interface DeptService {

    /**
     * 插入
     * @param deptEntity
     * @return
     */
    boolean addDept(DeptEntity deptEntity);

    /**
     * 根据id查找
     * @param deptNo
     * @return
     */
    DeptEntity findById(Long deptNo);

    /**
     * 查询全部
     * @return
     */
    List<DeptEntity> findAll();
}