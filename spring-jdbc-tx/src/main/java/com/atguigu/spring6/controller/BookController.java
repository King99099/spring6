package com.atguigu.spring6.controller;

import com.atguigu.spring6.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName:BookController
 * Package: com.atguigu.spring6.controller
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/23 - 17:00
 * @Version: v1.0
 */

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    public void buyBook(Integer bookId, Integer userId) {
        bookService.buyBook(bookId, userId);
    }
}
