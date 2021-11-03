package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(123)
public class MyDemoLoggingAspect {


    // this is where we add all our related advices for logging

    // let's start with a @Before advice
    @Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackage()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=======>>> Executing @Before Advice");
    }

}
