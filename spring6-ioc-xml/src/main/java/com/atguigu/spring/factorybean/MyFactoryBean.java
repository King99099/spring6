package com.atguigu.spring.factorybean;

import com.atguigu.spring.bean.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * ClassName:MyFactoryBean
 * Package: com.atguigu.spring.factorybean
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/18 - 15:19
 * @Version: v1.0
 */
public class MyFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
