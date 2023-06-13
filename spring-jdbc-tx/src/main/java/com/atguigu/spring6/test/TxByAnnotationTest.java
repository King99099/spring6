package com.atguigu.spring6.test;

import com.atguigu.spring6.controller.BookController;
import org.junit.jupiter.api.Test;
import org.junit.rules.Timeout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * ClassName:TxByAnnotationTest
 * Package: com.atguigu.spring6.test
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/23 - 17:09
 * @Version: v1.0
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")

public class TxByAnnotationTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook(){
        bookController.buyBook(1, 1);
    }
}
