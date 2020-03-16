package com.connext.client.entity;/**
 * @author Jason.Wu1.
 * @date 2020/3/16.
 * @time 9:46.
 */

import lombok.Data;

import java.util.List;

/**
 * @program: ordersystem
 * @description: 反参
 * @author: Jason.Wu1
 * @create: 2020-03-16 09:46
 **/
@Data
public class UserVO {
    private int code;
    private String msg;
    private int count;
    private List<User> data;
}
