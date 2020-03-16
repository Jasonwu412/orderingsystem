package com.connext.user.repository;/**
 * @author Jason.Wu1.
 * @date 2020/3/14.
 * @time 13:30.
 */

import com.connext.user.entity.User;

import java.util.List;

/**
 * @program: ordersystem
 * @description: 业务逻辑
 * @author: Jason.Wu1
 * @create: 2020-03-14 13:30
 **/
public interface UserRepository {
    public List<User> findAll(int index, int limit);
    public User findById(long id);
    public int count();
    public void save(User user);
    public void update(User user);
    public void deleteById(long id);
}
