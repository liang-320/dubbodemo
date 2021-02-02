package com.atguigu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Zhenjiang Liang
 * @Date 2021/1/19 18:56
 * @Version 1.0
 */

@RestController
@RequestMapping("/demo")
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String getName(String name) {
        //远程调用
        String result = helloService.sayHello(name);
        System.out.println(result);
        return result;
    }

}
