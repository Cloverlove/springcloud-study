package com.clover.springcloud.service;
import com.clover.springcloud.entities.DeptEntity;
import java.util.List;

/**
 *
 * @author Huxudong
 * @createTime 2019-05-11 14:08:07
 **/
public interface DeptService {
    public boolean add(DeptEntity dept);

    public DeptEntity get(Long id);

    public List<DeptEntity> list();

}

