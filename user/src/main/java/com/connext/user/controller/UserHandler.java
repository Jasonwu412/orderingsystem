package com.connext.user.controller;/**
 * @author Jason.Wu1.
 * @date 2020/3/12.
 * @time 14:55.
 */

import com.connext.user.entity.User;
import com.connext.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: ordersystem
 * @description: user服务提供者控制器
 * @author: Jason.Wu1
 * @create: 2020-03-12 14:55
 **/
@RestController
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll/{index}/{limit}")
    public List<User> findAll(@PathVariable("index") int index,@PathVariable("limit") int limit){
        return userRepository.findAll(index, limit);
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id")long id){
        return userRepository.findById(id);
    }

    @GetMapping("/count")
    public int count(){
        return userRepository.count();
    }

    @PostMapping("/save")
    public void save(@RequestBody User user){
        userRepository.save(user);
    }

    @PutMapping("/update")
    public void update(@RequestBody User user){
        userRepository.update(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        userRepository.deleteById(id);
    }
}
