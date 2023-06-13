package com.atguigu.spring6.validation.method2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * ClassName:ValidationConfig
 * Package: com.atguigu.spring6.validation.method2
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/29 - 9:54
 * @Version: v1.0
 */

@Configuration
@ComponentScan("com.atguigu.spring6.validation.method2")
public class ValidationConfig {
    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }
}

