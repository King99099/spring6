package com.atguigu.spring6.autowired.service;

import com.atguigu.spring6.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserServiceImpl
 * Package: com.atguigu.spring6.service
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/18 - 18:43
 * @Version: v1.0
 */
@Service
public class UserServiceImpl implements UserService {
    //属性注入
/*    @Autowired
    private UserDao userDao;*/
    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;

    //set注入
/*    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    //构造方法注入
/*    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }*/

    //形参注入
   /* public UserServiceImpl(@Autowired UserDao userDao) {
        this.userDao = userDao;
    }*/



    @Override
    public void add() {
        System.out.println("userService .......");
        userDao.add();
    }
}
