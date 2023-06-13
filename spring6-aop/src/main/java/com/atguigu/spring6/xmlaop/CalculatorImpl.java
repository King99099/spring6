package com.atguigu.spring6.xmlaop;

import org.springframework.stereotype.Component;

/**
 * ClassName:CalculatorImpl
 * Package: com.atguigu.spring6
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/22 - 16:22
 * @Version: v1.0
 */
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {

        int result = i + j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int sub(int i, int j) {

        int result = i - j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int mul(int i, int j) {

        int result = i * j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int div(int i, int j) {

        int result = i / j;

        System.out.println("方法内部 result = " + result);

        return result;
    }
}
