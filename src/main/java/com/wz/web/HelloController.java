package com.wz.web;

import com.wz.config.StudentProperties;
import com.wz.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class HelloController {
    @Autowired
    private StudentProperties studentProperties;

//    @RequestMapping(value="/hello",method = RequestMethod.GET)
//    public String helloSpringBoot(){
//        return "HelloSpringBoot"+studentProperties.getName();
//    }
//
//    @RequestMapping(value="/info")
//    public String info(){
//        return studentProperties.getName()+studentProperties.getAge();
//    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("now", DateFormat.getDateInstance().format(new Date()));
        return "hello111";
    }
    @RequestMapping("/index")
    public String index(Model model){
        Person person = new Person();
        person.setName("weizeng");
        person.setPassword("test004");
        person.setDate(new Date());
        model.addAttribute(person);
        return "index";
    }
    @RequestMapping("person")
    @ResponseBody
    public Object person(){
        Person person = new Person();
        person.setName("null");
        person.setPassword("dsds");
        person.setDate(new Date());
        return person;
    }
}
