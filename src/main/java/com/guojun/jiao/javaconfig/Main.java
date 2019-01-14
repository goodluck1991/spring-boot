package com.guojun.jiao.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by guojun.jiao on 2019/1/10.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserFunctionService userFunctionService = applicationContext.getBean(UserFunctionService.class);
        UserFunctionService userFunctionService1 = applicationContext.getBean(UserFunctionService.class);
        System.out.println(userFunctionService.toString());
        System.out.println(userFunctionService1.toString());
//        System.out.println(userFunctionService.sayHello("javaConfig"));
        applicationContext.close();
    }
}
