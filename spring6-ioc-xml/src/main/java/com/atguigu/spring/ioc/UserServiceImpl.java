package com.atguigu.spring.ioc;

/**
 * ClassName:UserServiceImpl
 * Package: com.atguigu.spring.ioc
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/18 - 16:43
 * @Version: v1.0
 */
public class UserServiceImpl implements UserService{
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;
    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
