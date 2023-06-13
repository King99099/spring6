package com.atguigu.spring.springi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import java.util.Date;
import java.util.Locale;

/**
 * ClassName:Demo2
 * Package: com.atguigu.spring.springi18n
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/26 - 11:14
 * @Version: v1.0
 */
public class Demo2 {
    public static ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    public static ResourceBundleMessageSource messageSource = context.getBean(ResourceBundleMessageSource.class);
    public static void main(String[] args) {
        getMessages("CHINA");
        getMessages("USA");
    }
    public static void getMessages(String country){
        if ("CHINA".contains(country)){
            Object[] obj = {"中国",new Date()};
            String message = messageSource.getMessage("www.atguigu.com", obj, Locale.CHINA);
            System.out.println("message = " + message);
        } else {
            Object[] obj = {"America",new Date()};
            String message = messageSource.getMessage("www.atguigu.com", obj, Locale.US);
            System.out.println("message = " + message);
        }
    }
}
