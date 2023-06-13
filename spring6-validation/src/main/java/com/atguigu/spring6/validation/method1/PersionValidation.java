package com.atguigu.spring6.validation.method1;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * ClassName:PersionValidation
 * Package: com.atguigu.spring6.validation.method1
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/26 - 11:28
 * @Version: v1.0
 */
public class PersionValidation implements Validator {
    //supports方法用来表示此校验用在哪个类型上，
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    //validate是设置校验逻辑的地点，其中ValidationUtils，是Spring封装的校验工具类，帮助快速实现校验。
    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
        Person person = (Person) target;
        if (person.getAge() < 0) {
            errors.rejectValue("age", "error age_value < 0");
        } else if (person.getAge() > 200) {
            errors.rejectValue("age", "error age_value too old");
        }
    }
}
