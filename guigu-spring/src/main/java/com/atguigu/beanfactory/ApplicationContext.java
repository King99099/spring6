package com.atguigu.beanfactory;

/**
 * ClassName:ApplicationContext
 * Package: com.atguigu.beanfactory
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/22 - 11:00
 * @Version: v1.0
 */
public interface ApplicationContext {
    Object getBean(Class clazz);
}
