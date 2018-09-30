package com.wz.aop;

import java.lang.annotation.*;

/**
 * @description:
 * @author: WZ
 * @create: 2018-07-01 11:11
 **/

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface  Action {
    String name();
}
