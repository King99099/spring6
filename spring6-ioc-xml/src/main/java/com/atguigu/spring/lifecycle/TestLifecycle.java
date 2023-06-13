package com.atguigu.spring.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:TestLifecycle
 * Package: com.atguigu.spring.lifecycle
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/18 - 14:57
 * @Version: v1.0
 */
public class TestLifecycle {
    @Test
    public void testLifeCycle(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifecycle.xml");
        Order bean = context.getBean(Order.class);
        System.out.println(bean);
        System.out.println("6 - bean对象就绪可以使用");
    }
}
