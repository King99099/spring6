package com.atguigu.spring6.dao;

/**
 * ClassName:BookDao
 * Package: com.atguigu.spring6.dao
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/23 - 17:02
 * @Version: v1.0
 */
public interface BookDao {
    Integer getPriceByBookId(Integer bookId);

    void updateStock(Integer bookId);

    void updateBalance(Integer userId, Integer price);
}
