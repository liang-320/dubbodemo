package com.atgugu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atgugu.service.HelloService;

/**
 * @Author Zhenjiang Liang
 * @Date 2021/1/19 18:43
 * @Version 1.0
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
