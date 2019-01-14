package com.guojun.jiao.taskScheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by guojun.jiao on 2019/1/14.
 */
@Service
public class TaskSchedulerService {
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5s执行一次:" + SIMPLE_DATE_FORMAT.format(new Date()));
    }

    @Scheduled(cron = "0 51 17 ? * *")
    public void fixedTimeExecution(){
        System.out.println("指定时间执行:"+SIMPLE_DATE_FORMAT.format(new Date()));
    }
}
