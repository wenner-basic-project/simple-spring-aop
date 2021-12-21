package com.wenner.it.spring.aop.service.impl;

import com.wenner.it.spring.aop.service.Car;

public class Benz implements Car {
    @Override
    public void brandDisplay() {
        System.out.println("============Brand:Benz=======");
    }

    @Override
    public void carColor() {
        System.out.println("===========Benz Red==============");
    }
}
