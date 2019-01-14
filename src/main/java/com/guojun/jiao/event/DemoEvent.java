package com.guojun.jiao.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by guojun.jiao on 2019/1/14.
 */
public class DemoEvent extends ApplicationEvent{

    private static final long serialVersionUID = 1366477480864245692L;

    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
