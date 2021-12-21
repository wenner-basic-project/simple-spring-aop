package com.wenner.it.spring.aop.advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class CarEnhancer implements MethodBeforeAdvice, AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("------代理后------currentTime=" + System.currentTimeMillis());
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("------代理前------currentTime=" + System.currentTimeMillis());
    }
}
