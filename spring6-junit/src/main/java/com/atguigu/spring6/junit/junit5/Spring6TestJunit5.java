package com.atguigu.spring6.junit.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * ClassName:Spring6TestJunit5
 * Package: com.atguigu.spring6.junit.junit5
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/23 - 16:06
 * @Version: v1.0
 */


//两种方式均可
//方式一
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:beans.xml")
//方式二
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class Spring6TestJunit5 {
    @Autowired
    private User user;

    @Test
    public void test1(){
        System.out.println("user = " + user);
        user.run();
    }
}
