package com.atguigu.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName:UserDaoImpl
 * Package: com.atguigu.spring6.dao
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/18 - 18:43
 * @Version: v1.0
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("userDao.......");
    }
}
