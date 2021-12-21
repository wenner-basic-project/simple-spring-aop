package com.wenner.it.spring.aop.service.impl;

import com.wenner.it.spring.aop.service.Car;

import javax.sql.rowset.CachedRowSet;

public class BmwImpl implements Car {
    @Override
    public void brandDisplay() {
        System.out.println("----brand: BMW----------");
    }

    @Override
    public void carColor() {
        System.out.println("--------------blue----------");
    }
}
