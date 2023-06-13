package com.atguigu.spring6.example;

import org.junit.jupiter.api.Test;

/**
 * ClassName:TestCalculator
 * Package: com.atguigu.spring6
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/22 - 16:26
 * @Version: v1.0
 */
public class TestCalculator {
    @Test
    public void test1(){
       /* Calculator calculator = new CalculatorImpl();
        Calculator calculator1 = new CalculatorLogImpl();
        Calculator calculator2 = new CalculatorStaticProxy(calculator);

        calculator.add(5,5);
        System.out.println("--------------");
        calculator1.add(6,6);
        System.out.println("--------------");
        calculator2.add(7,7);
        System.out.println("--------------");*/

        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator calculator = (Calculator) proxyFactory.getProxy();
        int add = calculator.add(3, 6);

    }
}
