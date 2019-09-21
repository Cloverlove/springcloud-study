package com.clover.springcloud.dao;
import com.clover.springcloud.entities.DeptEntity;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface DeptDao {
    public  boolean addDept(DeptEntity dept);
    public DeptEntity findById(Long id);
    public List<DeptEntity> findAll();
}
