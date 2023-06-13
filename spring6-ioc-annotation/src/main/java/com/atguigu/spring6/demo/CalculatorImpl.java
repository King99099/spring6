package com.atguigu.spring6.demo;

/**
 * ClassName:CalculatorImpl
 * Package: com.atguigu.spring6.demo
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/19 - 15:01
 * @Version: v1.0
 */
public class CalculatorImpl implements Calculator{
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
