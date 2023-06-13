package com.atguigu.spring6.validation.method2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindException;
import org.springframework.validation.Validator;

/**
 * ClassName:MyService2
 * Package: com.atguigu.spring6.validation.method2
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/29 - 14:37
 * @Version: v1.0
 */
@Service
public class MyService2 {

    @Autowired
    private Validator validator;

    public boolean validaPersonByValidator(User user) {
        BindException bindException = new BindException(user, user.getName());
        validator.validate(user, bindException);
        return bindException.hasErrors();
    }
}
