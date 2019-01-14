package com.guojun.jiao.conditional;

/**
 * Created by guojun.jiao on 2019/1/14.
 */
public class MacListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
