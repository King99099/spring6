package com.atguigu.spring6.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * ClassName:JDBCTemplate
 * Package: com.atguigu.spring6
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/23 - 16:41
 * @Version: v1.0
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class JDBCTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testUpdate() {
        String sql = "insert into t_emp values(null,?,?,?)";
        int updateRows = jdbcTemplate.update(sql, "李四", 25, "女");
        System.out.println("updateRows = " + updateRows);
    }

    @Test
    public void testSelect() {
        String sql = "select * from t_emp where id = ?";
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println("emp = " + emp);
    }

    @Test
    public void testSelectForList() {
        String sql = "select * from t_emp";
        List<Emp> queryList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        queryList.forEach(System.out::println);
    }

    @Test
    public void testCount() {
        String sql = "select count(*) from t_emp";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("integer = " + integer);
    }
}
