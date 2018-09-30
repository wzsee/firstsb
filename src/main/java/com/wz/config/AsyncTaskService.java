package com.wz.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @program: firstsb
 * @description: 异步任务执行类
 * @author: WZ
 * @create: 2018-06-20 23:22
 **/

@Service
public class AsyncTaskService {

    @Async
    public void executeAstncTask(Integer i){
        System.out.println("执行异步任务："+i);
    }

    public void executeAstncTaskPlus(Integer i){
        System.out.println("执行异步任务+1:"+(i+1));
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            asyncTaskService.executeAstncTask(i);
            asyncTaskService.executeAstncTaskPlus(i);
        }
    }
}
