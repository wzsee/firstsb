package com.wz.service;

import com.wz.aop.Action;
import org.springframework.stereotype.Service;

/**
 * @description:使用注解的被拦截类
 * @author: WZ
 * @create: 2018-07-01 14:57
 **/
@Service
public class DemoAnnotationService {

    @Action(name="注解式拦截的add操作")
    public void add(){}

}
