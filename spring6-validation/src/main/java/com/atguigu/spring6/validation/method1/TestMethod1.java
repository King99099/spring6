package com.atguigu.spring6.validation.method1;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * ClassName:TestMethod1
 * Package: com.atguigu.spring6.validation.method1
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/26 - 11:37
 * @Version: v1.0
 */
public class TestMethod1 {
    public static void main(String[] args) {
        Person person = new Person();
        //person.setName("张国伟");
        person.setAge(-1);

        DataBinder dataBinder = new DataBinder(person);
        dataBinder.setValidator(new PersionValidation());
        dataBinder.validate();
        BindingResult bindingResult = dataBinder.getBindingResult();
        System.out.println("bindingResult = " + bindingResult);
    }
}
