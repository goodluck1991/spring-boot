package com.guojun.jiao.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by guojun.jiao on 2019/1/14.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println("我(bean-demo listener) 收到 bean-demo publisher 发布的消息:"+demoEvent.getMsg());
    }
}
