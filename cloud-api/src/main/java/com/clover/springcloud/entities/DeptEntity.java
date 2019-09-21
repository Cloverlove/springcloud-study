package com.clover.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 部门实体类
 * @author Huxudong
 * @date   2019-09-03 18:09:15
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class DeptEntity implements Serializable {
    /**
     *  部门编码 主键
     */
    private Long deptNo;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 数据库名称
     */
    private String dbSource;
}
