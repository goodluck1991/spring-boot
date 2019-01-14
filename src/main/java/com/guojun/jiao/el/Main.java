package com.guojun.jiao.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by guojun.jiao on 2019/1/11.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.outputResource();
        context.close();
    }
}
