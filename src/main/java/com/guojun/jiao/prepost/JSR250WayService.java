package com.guojun.jiao.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by guojun.jiao on 2019/1/14.
 */
public class JSR250WayService {
    @PostConstruct//在构造函数执行完成之后执行
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy//在bean销毁之前执行
    public void destroy(){
        System.out.println("jsr250-destroy-method");
    }
}
