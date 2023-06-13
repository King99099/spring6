package com.atguigu.spring.factorybean;

import com.atguigu.spring.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.Serializable;

/**
 * ClassName:TestFactoryBean
 * Package: com.atguigu.spring.factorybean
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/18 - 15:21
 * @Version: v1.0
 */
public class TestFactoryBean {
    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-factorybean.xml");
        User user = (User) context.getBean("user");
        System.out.println("user = " + user);
    }
}
