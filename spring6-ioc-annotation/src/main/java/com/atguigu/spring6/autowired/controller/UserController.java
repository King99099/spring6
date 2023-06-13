package com.atguigu.spring6.autowired.controller;

import com.atguigu.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName:UserController
 * Package: com.atguigu.spring6.controller
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/18 - 18:42
 * @Version: v1.0
 */

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        System.out.println("userController.......");
        userService.add();
    }
}
