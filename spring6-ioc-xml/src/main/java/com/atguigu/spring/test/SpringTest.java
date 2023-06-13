package com.atguigu.spring.test;

import com.atguigu.spring.bean.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * ClassName:test
 * Package: com.atguigu.maven.bean.com.atguigu.spring
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/16 - 10:08
 * @Version: v1.0
 */
public class SpringTest {
    @Test
    public void testIOC(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) context.getBean("user");
        User user1 = context.getBean(User.class);
        User user2 = context.getBean("user", User.class);
        System.out.println("user = " + user);
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
       /* String id = context.getId();
        System.out.println("id = " + id);
        User user = (User) context.getBean("user");
        System.out.println("user = " + user);
        String applicationName = context.getApplicationName();
        System.out.println("applicationName = " + applicationName);
        String displayName = context.getDisplayName();
        System.out.println("displayName = " + displayName);
        ApplicationContext parent = context.getParent();
        System.out.println("parent = " + parent);
        long startupDate = context.getStartupDate();
        System.out.println("startupDate = " + startupDate);
        System.out.println("=========");
        user.run();*/

    }
    //测试注入
    // setter注入
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book book = (Book) context.getBean("book");
        System.out.println("book = " + book);
    }
    // 构造器注入
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book book = (Book) context.getBean("book2",Book.class);
        System.out.println("book = " + book);
    }
//测试外部bean 注入
    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee emp = context.getBean("emp", Employee.class);
        emp.work();
    }
    //测试内部bean注入
    @Test
    public void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee emp = context.getBean("emp2", Employee.class);
        emp.work();
    }

    //级联属性赋值
    @Test
    public void test6(){
        test4();
        test5();
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee emp = context.getBean("emp3", Employee.class);
        emp.work();
    }
    //测试数组类型赋值
    @Test
    public void test7(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee emp3 = context.getBean("emp4", Employee.class);
        System.out.println(emp3);

    }
    //测试List集合类型赋值
    @Test
    public void test8(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee emp3 = context.getBean("emp5", Employee.class);
        System.out.println(emp3);

    }

    //测Map试集合类型赋值
    @Test
    public void test9(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee emp3 = context.getBean("emp6", Employee.class);
        System.out.println(emp3);

    }

    @Test
    public void test10(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Clazz clazz = context.getBean("clazz", Clazz.class);
        System.out.println(clazz);
    }


    @Test
    public void test11(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Student stu3 = context.getBean("stu3", Student.class);
        System.out.println(stu3);
    }

    @Test
    public void test12() throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println("dataSource = " + dataSource);
        Connection connection = dataSource.getConnection();
        System.out.println("connection = " + connection);
    }
}
