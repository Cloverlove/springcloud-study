package com.clover.springcloud.service.impl;
import com.clover.springcloud.dao.DeptDao;
import com.clover.springcloud.entities.DeptEntity;
import com.clover.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public boolean add(DeptEntity dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public DeptEntity get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<DeptEntity> list() {
        return deptDao.findAll();
    }
}
