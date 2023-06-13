package com.atguigu.spring6.validation.method2;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/**
 * ClassName:User
 * Package: com.atguigu.spring6.validation.method2
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/29 - 9:56
 * @Version: v1.0
 */
public class User {
    @NotNull
    private String name;
    @Min(0)
    @Max(100)
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
