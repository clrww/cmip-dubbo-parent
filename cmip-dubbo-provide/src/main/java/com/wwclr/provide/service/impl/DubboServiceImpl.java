package com.wwclr.provide.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wwclr.api.service.DubboService;

/**
 * Created by xebest on 2018/1/4.
 */
@Service
public class DubboServiceImpl implements DubboService {
    @Override
    public void sayHello(String name) {
        System.out.println(name);
        System.out.println("---dubbo 发布服务----");
    }
}
