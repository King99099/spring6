package com.atguigu.spring6.reflect;

/**
 * ClassName:User
 * Package: com.atguigu.spring6.reflect
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/22 - 10:05
 * @Version: v1.0
 */
public class User {
    private String userName;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void show(){
        System.out.println("京东用户");
    }
}
