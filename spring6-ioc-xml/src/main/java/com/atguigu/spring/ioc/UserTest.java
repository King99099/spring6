package com.atguigu.spring.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:UserTest
 * Package: com.atguigu.spring.ioc
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/18 - 16:48
 * @Version: v1.0
 */
public class UserTest {
    @Test
    public void testUser(){
        ApplicationContext  context = new ClassPathXmlApplicationContext("bean-ioc.xml");
        UserController userController = context.getBean(UserController.class);
        userController.saveUser();
    }
    @Test
    public void testUser2(){
        ApplicationContext  context = new ClassPathXmlApplicationContext("bean-ioc2.xml");
        UserController userController = context.getBean(UserController.class);
        userController.saveUser();
    }
    @Test
    public void testUser3(){
        ApplicationContext  context = new ClassPathXmlApplicationContext("bean-ioc3.xml");
        UserController userController = context.getBean(UserController.class);
        userController.saveUser();
    }
}
