package com.atguigu.spring.ioc;

/**
 * ClassName:UserDaoImpl
 * Package: com.atguigu.spring.ioc
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/18 - 16:44
 * @Version: v1.0
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void saveUser() {
        System.out.println("用户保存成功");
    }
}
