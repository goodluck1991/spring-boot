package com.guojun.jiao.el;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * Created by guojun.jiao on 2019/1/11.
 * @PropertySource指定配置文件地址,若使用@Value注入,则需要配置一个PropertySourcesPlaceholderConfigurer的bean
 */
@Configuration
@ComponentScan("com.guojun.jiao.el")
@PropertySource("classpath:com/guojun/jiao/el/test.properties")
public class ElConfig {
    @Value("IVY")
    private String normal;
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{T(java.lang.Math).random() * 100}")
    private double randomNumber;
    @Value("#{demoService.another}")
    private String fromAnother;
    @Value("classpath:com/guojun/jiao/el/test.properties")
    private Resource testFile;
    @Value("http://www.baidu.com")
    private Resource testUrl;
    @Value("${book.name}")//注意使用的${}
    private String bookName;
    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer configurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "ElConfig{" +
                "normal='" + normal + '\'' +
                ", osName='" + osName + '\'' +
                ", randomNumber=" + randomNumber +
                ", fromAnother='" + fromAnother + '\'' +
                ", testFile=" + testFile +
                ", testUrl=" + testUrl +
                ", bookName='" + bookName + '\'' +
                ", environment=" + environment +
                '}';
    }
}
