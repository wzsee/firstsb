package com.wz.service;

import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: WZ
 * @create: 2018-07-01 01:48
 **/

@Service
public class FunctionService {

    public String sayHello(String word){
        return "hello" + word;
    }

}
