package com.atguigu.spring6.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName:UserDaoImpl
 * Package: com.atguigu.spring6.annotation.dao
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/19 - 11:05
 * @Version: v1.0
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("userDao......");
    }
}
