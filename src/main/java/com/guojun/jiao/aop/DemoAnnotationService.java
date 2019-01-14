package com.guojun.jiao.aop;

import org.springframework.stereotype.Service;

/**
 * Created by guojun.jiao on 2019/1/11.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "annotation of guojun.jiao")
    public void add(){
        System.out.println("DemoAnnotationService.add");
    }
}
