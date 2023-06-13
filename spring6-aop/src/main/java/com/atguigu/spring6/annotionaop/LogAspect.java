package com.atguigu.spring6.annotionaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * ClassName:LogAspect
 * Package: com.atguigu.spring6.annotionaop
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/22 - 19:01
 * @Version: v1.0
 */
@Aspect
@Component
public class LogAspect {
    @Before(value = "execution(public int com.atguigu.spring6.annotionaop.CalculatorImpl.*(.. ))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->前置通知，方法名：" + methodName + ",参数为:" + args);
    }

    @After("pointcut()")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->后置通知，方法名：" + methodName + ",参数为:" + args);
    }
    @AfterReturning(value = "execution(* com.atguigu.spring6.annotionaop.*.*(..))",returning = "result")
    public void afterReturnMethod(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->返回通知，方法名：" + methodName + ",参数为:" + args + ",返回值为:" + result);
    }
    @AfterThrowing(value = "execution(* com.atguigu.spring6.annotionaop.Calculator.*(..))",throwing = "ex")
    public void afterThrowMethod(JoinPoint joinPoint,Throwable ex){
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->异常通知，方法名：" + methodName + ",参数为:" + args + ",异常" + ex);
    }

    @Around(value = "execution(* com.atguigu.spring6.annotionaop.Calculator.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        Object result = null;
        try {
            System.out.println("环绕通知-->目标对象方法执行之前");
            result = joinPoint.proceed();
            System.out.println("环绕通知-->目标对象方法返回值之后");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("环绕通知-->目标对象方法出现异常时");
        } finally {
            System.out.println("环绕通知-->目标对象方法执行完毕");
        }
        return result;
    }
    @Pointcut(value = "execution(* com.atguigu.spring6.annotionaop.Calculator.*(..))")
    public void pointcut(){}
}
