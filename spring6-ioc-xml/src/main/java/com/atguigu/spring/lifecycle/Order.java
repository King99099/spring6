package com.atguigu.spring.lifecycle;

/**
 * ClassName:Order
 * Package: com.atguigu.spring.lifecycle
 * Description : bean生命周期
 *
 * @Author: zlf
 * @Create 2023/5/18 - 14:48
 * @Version: v1.0
 */
public class Order {
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        System.out.println("2 - 给bean对象设置属性）");
        this.orderName = orderName;
    }

    public void initMethod(){
        System.out.println("4 - bean对象初始化（需在配置bean时指定初始化方法）");
    }

    public void destroyMethod(){
        System.out.println("7 - bean对象初始化（需在配置bean时指定初始化方法）");
    }

    private String orderName;

    public Order(){
        System.out.println("1 - bean对象创建（调用无参构造器）");
    }
}
