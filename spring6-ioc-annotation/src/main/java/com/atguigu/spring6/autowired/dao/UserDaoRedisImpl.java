package com.atguigu.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName:UserDaoRedisImpl
 * Package: com.atguigu.spring6.dao
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/19 - 9:39
 * @Version: v1.0
 */

@Repository
public class UserDaoRedisImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDaoRedisImpl");
    }
}
