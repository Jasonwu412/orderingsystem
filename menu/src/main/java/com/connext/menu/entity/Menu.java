package com.connext.menu.entity;/**
 * @author Jason.Wu1.
 * @date 2020/2/13.
 * @time 13:00.
 */

import lombok.Data;

/**
 * @program: ordersystem
 * @description: 菜单实体类
 * @author: Jason.Wu1
 * @create: 2020-02-13 13:00
 **/
@Data
public class Menu {
    private long id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
