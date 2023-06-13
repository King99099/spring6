package com.atguigu.spring6.example;

import org.springframework.aop.target.ThreadLocalTargetSourceStats;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * ClassName:ProxyFactory
 * Package: com.atguigu.spring6
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/22 - 16:53
 * @Version: v1.0
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            Object result = null;

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("[动态代理][日志] " + method.getName() + "，参数：" + Arrays.toString(args));
                result = method.invoke(target, args);
                System.out.println("[动态代理][日志] " + method.getName() + "，结果：" + result);
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
