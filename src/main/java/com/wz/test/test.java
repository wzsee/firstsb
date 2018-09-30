package com.wz.test;

import com.wz.config.Diconfig;
import com.wz.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: 测试运行类
 * @author: WZ
 * @create: 2018-07-01 01:54
 **/

public class test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Diconfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("wz"));
    }

}
