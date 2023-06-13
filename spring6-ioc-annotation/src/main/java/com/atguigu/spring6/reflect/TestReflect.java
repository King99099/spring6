package com.atguigu.spring6.reflect;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * ClassName:TestReflect
 * Package: com.atguigu.spring6.reflect
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/22 - 10:08
 * @Version: v1.0
 */
public class TestReflect {
    @Test
    public void testUser() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        InputStream systemResourceAsStream = ClassLoader.getSystemResourceAsStream("user.properties");
        Properties properties = new Properties();
        properties.load(systemResourceAsStream);
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        Class aClass = Class.forName(className);
        Object instance = aClass.newInstance();
        Method declaredMethod = aClass.getDeclaredMethod(methodName);
        declaredMethod.invoke(instance);

    }
}
