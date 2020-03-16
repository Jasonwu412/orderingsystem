package com.connext.client.entity;/**
 * @author Jason.Wu1.
 * @date 2020/3/12.
 * @time 15:45.
 */

import lombok.Data;

import java.util.Date;

/**
 * @program: ordersystem
 * @description: User实体类
 * @author: Jason.Wu1
 * @create: 2020-03-12 15:45
 **/
@Data
public class User {
    private long id;
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;
    private Date registerdate;
    private String address;
}
