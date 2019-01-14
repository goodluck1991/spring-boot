package com.guojun.jiao.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by guojun.jiao on 2019/1/14.
 */
@Configuration
@ComponentScan("com.guojun.jiao.profile")
public class ProfileConfig {

    @Bean
    @Profile("dev")
    DemoBean devDemoBean(){
        return new DemoBean("from development profile");
    }

    @Bean
    @Profile("prod")
    DemoBean prodDemoBean(){
        return new DemoBean("from production profile");
    }
}
