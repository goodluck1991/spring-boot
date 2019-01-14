package com.guojun.jiao.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by guojun.jiao on 2019/1/11.
 */
@Configuration//配置文件类
@ComponentScan("com.guojun.jiao.aop")//注解扫描基路径
@EnableAspectJAutoProxy//开启spring对AspectJ代理的支持
public class AopConfig {

}
