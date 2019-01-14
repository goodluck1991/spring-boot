package com.guojun.jiao.javaconfig;


/**
 * Created by guojun.jiao on 2019/1/10.
 */
public class UserFunctionService {
    private FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
}
