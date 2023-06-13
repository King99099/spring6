package com.atguigu.service.impl;

import com.atguigu.annotation.Bean;
import com.atguigu.annotation.Di;
import com.atguigu.dao.UserDao;
import com.atguigu.service.UserService;

/**
 * ClassName:UserServiceImpl
 * Package: com.atguigu.service.impl
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/22 - 10:52
 * @Version: v1.0
 */
@Bean
public class UserServiceImpl implements UserService {
    @Di
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service .......");
        userDao.add();
    }
}
