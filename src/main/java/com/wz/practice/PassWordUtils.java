package com.wz.practice;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: WZ
 * @create: 2018-07-07 21:38
 **/

public class PassWordUtils {

    @UserCase(id = 23,description = "232")
    public boolean validatePassword(String  password){
        return password.matches("\\w*\\\\d\\\\w*");
    }

    @UserCase(id=32)
    public String encryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }

    public static void tarckUserCases(List<Integer> useCases,Class<?> cl){
        for (Method m : cl.getMethods()) {
            UserCase userCase = m.getAnnotation(UserCase.class);
            if( userCase!=null){
                System.out.println("找到"+userCase.id()+"  "+userCase.description());
                useCases.remove(new Integer(userCase.id()));
            }
        }
        for (int i : useCases) {
            System.out.println("Waring：MISSING user case-" + i);
        }
    }
    @Test
    public  void test2(){
        List<Integer> useCases = new ArrayList<Integer>();
        Collections.addAll(useCases, 23, 48, 49, 50);
        tarckUserCases(useCases, PassWordUtils.class);
    }

    public static void main(String[] args) {

    }

    @Test
    public void test(){
        System.out.println(encryptPassword("sds2"));
    }

}
