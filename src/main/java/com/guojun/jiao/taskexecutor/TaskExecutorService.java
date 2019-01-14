package com.guojun.jiao.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by guojun.jiao on 2019/1/14.
 */
@Service
@Async
public class TaskExecutorService {
    public void executorAsyncTask(int i){
        System.out.println("executorAsyncTask:"+i);
    }

    public void executorAsyncTaskPlus(int i){
        System.out.println("executorAsyncTaskPlus:"+i);
    }
}
