package com.atguigu.spring6.resource.dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName:UserDaoImpl
 * Package: com.atguigu.spring6.resource.dao
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/19 - 10:13
 * @Version: v1.0
 */

@Repository("userDao")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("userDao........");
    }
}
