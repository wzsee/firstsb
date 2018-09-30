package com.wz.test;

import com.wz.practice.UserCase;
import com.wz.service.DemoAnnotationService;
import com.wz.service.DemoMethodService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:AOP测试
 * @author: WZ
 * @create: 2018-07-01 17:01
 **/

public class Main {

//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
//        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
//        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
//       demoAnnotationService.add();
//        demoMethodService.add();
//        context.close();
//    }

    @Test
    public void testAnnotation(){
        boolean flag = validatePassword("sdsd");
        System.out.println(flag);
    }

    @UserCase(id = 23,description = "232")
    public boolean validatePassword(String  password){
        return password.matches("\\w*\\\\d\\\\w*");
    }

}
