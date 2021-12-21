package com.wenner.it.spring.aop;

import com.wenner.it.spring.aop.service.Car;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args) throws BeansException {
        ApplicationContext act = new ClassPathXmlApplicationContext("spring.xml");

        Car carProxy1 = (Car)act.getBean("proxy");

        Car carProxy2 = (Car)act.getBean("proxy2");

        carProxy1.brandDisplay();
        carProxy1.carColor();

        System.out.println("");

        carProxy2.brandDisplay();
        carProxy2.carColor();
    }
}
