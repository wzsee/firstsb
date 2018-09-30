package com.wz.service;

import org.springframework.stereotype.Service;

/**
 * @description: 使用方法规则被拦截类
 * @author: WZ
 * @create: 2018-07-01 15:00
 **/
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("DemoMethodService");
    }
}
