package com.guojun.jiao.taskScheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by guojun.jiao on 2019/1/14.
 */
@Configuration
@ComponentScan("com.guojun.jiao.taskScheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
