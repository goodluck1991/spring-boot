package com.guojun.jiao.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Autor GuojunJiao
 * @Descrition :
 * @Date 22:28 2019/1/14
 */
@RunWith(SpringJUnit4ClassRunner.class)//在junit环境下提供spring testcontext framework的功能
@ContextConfiguration(classes = {TestConfig.class})//用来加载配置applicationContext,其中classes用来加载配置类
@ActiveProfiles("dev")//用来声明活动的profile
public class DemoBeanIntergrationTests {
    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanshouldInject(){
        String expectid = "from development profile";
        String actual = testBean.getContext();
        Assert.assertEquals(expectid,actual);
    }
}
