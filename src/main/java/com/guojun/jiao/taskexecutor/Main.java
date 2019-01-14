package com.guojun.jiao.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by guojun.jiao on 2019/1/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        TaskExecutorService taskExecutorService = context.getBean(TaskExecutorService.class);
        for(int i=0;i<20;i++){
            taskExecutorService.executorAsyncTask(i);
            taskExecutorService.executorAsyncTaskPlus(i);
        }
        context.close();
    }
}
