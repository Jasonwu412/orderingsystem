package com.connext.order.controller;/**
 * @author Jason.Wu1.
 * @date 2020/2/12.
 * @time 13:45.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: ordersystem
 * @description: order服务提供者控制器
 * @author: Jason.Wu1
 * @create: 2020-02-12 13:45
 **/
@RestController
@RequestMapping("/order")
public class OrderHandler {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String getPort() {
        return "当前order的端口号为" + this.port;
    }
}
