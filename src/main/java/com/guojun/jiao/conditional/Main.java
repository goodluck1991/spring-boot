package com.guojun.jiao.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by guojun.jiao on 2019/1/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        MacListService macListService = context.getBean(MacListService.class);
        System.out.println(macListService.showListCmd());
        context.close();
    }
}
