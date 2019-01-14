package com.guojun.jiao.service;

import org.springframework.stereotype.Service;

/**
 * Created by guojun.jiao on 2019/1/10.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return String.format("Hello %s !",word);
    }
}
