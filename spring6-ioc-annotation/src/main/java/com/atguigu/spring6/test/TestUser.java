package com.atguigu.spring6.test;

import com.atguigu.spring6.annotation.base.Spring6Config;


import com.atguigu.spring6.annotation.service.UserService;
import com.atguigu.spring6.autowired.controller.UserController;
import com.atguigu.spring6.reflect.Car;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.*;

/**
 * ClassName:TestUser
 * Package: com.atguigu.spring6.test
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/18 - 18:49
 * @Version: v1.0
 */
public class TestUser {
    @Test
    public void test0() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = context.getBean(UserController.class);
        userController.add();
    }

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean(UserService.class);
        userService.add();
    }


    @Test
    public void test2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config.class);
        UserService userService = context.getBean(UserService.class);
        userService.add();
    }

    @Test
    public void test3() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Car> car1 = Car.class;
        Class<? extends Car> car2 = new Car().getClass();
        Class car3= Class.forName("com.atguigu.spring6.reflect.Car");
        Car car = (Car) car3.getConstructor().newInstance();


        //获取构造方法
        Constructor[] constructors = car3.getConstructors();
        System.out.println(constructors.length);
        for (int i = 0; i < constructors.length; i++) {
            System.out.println(constructors[i]);
        }
        Constructor constructor = car3.getConstructor();
        System.out.println("constructor = " + constructor);
        Constructor constructor1 = car3.getConstructor(String.class, int.class, String.class);
        System.out.println("constructor1 = " + constructor1);

        Constructor[] declaredConstructors = car3.getDeclaredConstructors();
        for (int i = 0; i < declaredConstructors.length; i++) {
            System.out.println("declaredConstructors = " + declaredConstructors[i]);
        }

        System.out.println("get Method.........");
        //获取属性
        Method[] declaredMethods = car3.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            System.out.println("declaredMethods[" + i + "]=" + declaredMethods[i]);
            String name = declaredMethods[i].getName();
            System.out.println("name = " + name);
            int parameterCount = declaredMethods[i].getParameterCount();
            System.out.println("parameterCount = " + parameterCount);

            TypeVariable<Method>[] typeParameters = declaredMethods[i].getTypeParameters();
            for (int i1 = 0; i1 < typeParameters.length; i1++) {
                System.out.println("typeParameters = " + typeParameters[i]);
            }
            Parameter[] parameters = declaredMethods[i].getParameters();
            for (int i1 = 0; i1 < parameters.length; i1++) {
                System.out.println("parameters = " + parameters);
            }
        }
        System.out.println("get fields ..........");
        //获取方法
        Field[] declaredFields = car3.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            System.out.println("declaredFields" + i + "=" + declaredFields[i]);
            String name = declaredFields[i].getName();
            Class<?> type = declaredFields[i].getType();
            int modifiers = declaredFields[i].getModifiers();
            System.out.println("name = " + name);
            System.out.println("type = " + type);

        }
        //获取方法
    }
}
