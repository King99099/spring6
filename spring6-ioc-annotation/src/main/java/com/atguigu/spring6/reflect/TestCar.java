package com.atguigu.spring6.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName:TestCar
 * Package: com.atguigu.spring6.reflect
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/19 - 18:11
 * @Version: v1.0
 */
public class TestCar {
    @Test
    public void test1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class car = Class.forName("com.atguigu.spring6.reflect.Car");
        Car car1 = (Car)car.getConstructor().newInstance();
        Method declaredMethod = car.getDeclaredMethod("run",null);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(car1,null);

        System.out.println("-----------------------------");
        ClassLoader platformClassLoader = ClassLoader.getPlatformClassLoader();
        System.out.println("platformClassLoader = " + platformClassLoader);
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("systemClassLoader = " + systemClassLoader);
        ClassLoader classLoader = Class.forName("com.atguigu.spring6.reflect.Car").getClassLoader();
        System.out.println("classLoader = " + classLoader);

    }
}
