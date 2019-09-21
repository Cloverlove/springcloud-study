package com.clover.springcloud.service.Impl;
import com.clover.springcloud.entities.DeptEntity;
import com.clover.springcloud.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clover.springcloud.service.DeptService;

import java.util.List;


/**
 * 
 * @author Huxudong
 * @date   2019-09-09 19:59:57
 **/
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;
    @Override
    public boolean addDept(DeptEntity deptEntity) {
      return   deptDao.addDept(deptEntity);
    }

    @Override
    public DeptEntity findById(Long deptNo) {
        return  deptDao.findById(deptNo);
    }

    @Override
    public List<DeptEntity> findAll() {
        return deptDao.findAll();
    }
}