package com.atguigu.dao.impl;

import com.atguigu.annotation.Bean;
import com.atguigu.dao.UserDao;

/**
 * ClassName:UserDaoImpl
 * Package: com.atguigu.dao.impl
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/22 - 10:53
 * @Version: v1.0
 */
@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("Dao .......");
    }
}
