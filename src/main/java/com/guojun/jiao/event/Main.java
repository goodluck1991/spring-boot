package com.guojun.jiao.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by guojun.jiao on 2019/1/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");

        context.close();
    }
}
