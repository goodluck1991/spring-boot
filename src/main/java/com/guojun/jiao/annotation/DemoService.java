package com.guojun.jiao.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by guojun.jiao on 2019/1/14.
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得bean");
    }
}
