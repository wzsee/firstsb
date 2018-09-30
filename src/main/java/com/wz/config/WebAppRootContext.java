package com.wz.config;

import com.wz.listenner.WebAppRootListener;
import org.springframework.boot.web.servlet.ServletContextInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @description: 上下文监听配置
 * @author: WZ
 * @create: 2018-06-21 22:47
 **/

public class WebAppRootContext implements ServletContextInitializer{


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.addListener(WebAppRootListener.class);
        servletContext.setInitParameter("sss","bbb");
    }
}
