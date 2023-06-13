package com.atguigu.spring6.annotionaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:TestAop
 * Package: com.atguigu.spring6.annotionaop
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/22 - 19:03
 * @Version: v1.0
 */
public class TestAop {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator bean = context.getBean(Calculator.class);
        bean.div(5,0);
    }
}
