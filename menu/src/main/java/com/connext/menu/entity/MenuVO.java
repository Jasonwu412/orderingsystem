package com.connext.menu.entity;/**
 * @author Jason.Wu1.
 * @date 2020/2/16.
 * @time 20:55.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: ordersystem
 * @description:
 * @author: Jason.Wu1
 * @create: 2020-02-16 20:55
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuVO {
    private int code;
    private String msg;
    private int count;
    private List<Menu> data;
}
