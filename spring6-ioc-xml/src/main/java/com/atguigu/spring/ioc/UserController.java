package com.atguigu.spring.ioc;

/**
 * ClassName:UserController
 * Package: com.atguigu.spring.ioc
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/18 - 16:42
 * @Version: v1.0
 */
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
