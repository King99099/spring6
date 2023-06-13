package com.atguigu.spring6.config;

import com.atguigu.spring6.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.Annotation;

/**
 * ClassName:TxAllAnnotation
 * Package: com.atguigu.spring6.config
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/24 - 16:43
 * @Version: v1.0
 */
public class TxAllAnnotation {

    @Test
    public void testTxAllAnnotation(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController bean = context.getBean(BookController.class);
        bean.buyBook(1,1);
    }
}
