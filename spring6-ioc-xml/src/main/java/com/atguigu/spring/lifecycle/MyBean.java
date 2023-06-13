package com.atguigu.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * ClassName:MyBean
 * Package: com.atguigu.spring.lifecycle
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/18 - 15:07
 * @Version: v1.0
 */
public class MyBean implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3 - bean的后置处理器（初始化之前）");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5 - bean的后置处理器（初始化之后）");
        return bean;
    }
}
