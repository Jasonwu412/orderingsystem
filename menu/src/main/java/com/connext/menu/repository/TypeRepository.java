package com.connext.menu.repository;

import com.connext.menu.entity.Type;

import java.util.List;

/**
 * @author Jason.Wu1.
 * @date 2020/2/17.
 * @time 15:01.
 */
public interface TypeRepository {
    /**
     * 根据id查询菜品种类
     * @param id
     * @return
     */
    public Type findById(long id);
    /***
    * @program:
    * @description: 查询所有菜品种类
    * @Author: Jason.Wu1
    * @Date: 2020/3/11
    */
    public List<Type> findAll();
}
