package com.guojun.jiao.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by guojun.jiao on 2019/1/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();
    }
}
