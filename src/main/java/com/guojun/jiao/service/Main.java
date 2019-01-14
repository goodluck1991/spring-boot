package com.guojun.jiao.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by guojun.jiao on 2019/1/10.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        UserFunctionService userFunctionService = applicationContext.getBean(UserFunctionService.class);
        System.out.println(userFunctionService.sayHello("guojun.jiao"));
        applicationContext.close();
    }
}
