package com.atguigu.spring6.resource.service;


import com.atguigu.spring6.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserServiceImpl
 * Package: com.atguigu.spring6.resource.service
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/19 - 10:14
 * @Version: v1.0
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao myUserDao;

    @Override
    public void add() {
        System.out.println("UserService......");
        myUserDao.add();
    }
}
