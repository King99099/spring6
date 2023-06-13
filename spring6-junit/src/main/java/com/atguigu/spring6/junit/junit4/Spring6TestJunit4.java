package com.atguigu.spring6.junit.junit4;

import com.atguigu.spring6.junit.junit5.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ClassName:Spring6TestJunit4
 * Package: com.atguigu.spring6.junit.junit4
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/23 - 16:09
 * @Version: v1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class Spring6TestJunit4 {
    @Autowired
    private User user;

    @Test
    public void test1(){
        System.out.println("user = " + user);
        user.run();
    }
}
