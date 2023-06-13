package com.atguigu.spring.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:TestUser
 * Package: com.atguigu.spring.pojo
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/15 - 17:10
 * @Version: v1.0
 */
public class TestUser {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) context.getBean("user");
        System.out.println("user = " + user);
        user.add();
    }
}
