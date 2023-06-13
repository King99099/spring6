package com.atguigu.spring6.annotation.service;


import com.atguigu.spring6.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * ClassName:UserServiceImpl
 * Package: com.atguigu.spring6.annotation.service
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/19 - 11:05
 * @Version: v1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void add() {
        System.out.println("userService......");
        userDao.add();
    }
}
