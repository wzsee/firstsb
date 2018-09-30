package com.wz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: WZ
 * @create: 2018-07-01 01:50
 **/

@Service
public class UseFunctionService {
    @Autowired
    private FunctionService functionService;

    public String sayHello(String word){
        return  functionService.sayHello(word);
    }
}
