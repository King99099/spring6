package com.atguigu.spring6.validation.method2;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Set;

/**
 * ClassName:MyService1
 * Package: com.atguigu.spring6.validation.method2
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/29 - 10:00
 * @Version: v1.0
 */
@Service
public class MyService1 {

    @Autowired
    public Validator validator;

    public boolean validator(User user){
        Set<ConstraintViolation<User>> sets = validator.validate(user);
        return sets.isEmpty();
    }
}
