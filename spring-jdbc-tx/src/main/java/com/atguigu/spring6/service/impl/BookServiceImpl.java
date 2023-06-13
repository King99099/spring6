package com.atguigu.spring6.service.impl;

import com.atguigu.spring6.dao.BookDao;
import com.atguigu.spring6.service.BookService;
import org.junit.rules.Timeout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * ClassName:BookServiceImpl
 * Package: com.atguigu.spring6.service.impl
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/23 - 17:02
 * @Version: v1.0
 */
//@Transactional(readOnly = true)
//@Transactional(timeout = 3)
@Transactional
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public void buyBook(Integer bookId, Integer userId) {

     /*   try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书的库存
        bookDao.updateStock(bookId);
        //更新用户的余额
        bookDao.updateBalance(userId, price);
    }
}
