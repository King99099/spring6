package com.atguigu.spring6.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.naming.Name;

/**
 * ClassName:DemoTest
 * Package: com.atguigu.spring6.demo
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/19 - 15:04
 * @Version: v1.0
 */
@Service
public class DemoTest {
    private CalculatorLogImpl calculatorLog = new CalculatorLogImpl();

    @Test
    public void test1(){
        calculatorLog.add(5,5);
    }
}
