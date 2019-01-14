package com.guojun.jiao.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by guojun.jiao on 2019/1/14.
 */
@Configuration
@ComponentScan("com.guojun.jiao.conditional")
public class ConditionConfig {

    @Bean
    @Conditional(MacCondition.class)
    public ListService macListService(){
        return new MacListService();
    }

}
