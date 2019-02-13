package com.amaduse.demo.service.Impl;

import com.amaduse.demo.service.TestInterface;

import java.lang.annotation.Annotation;

@TestInterface(sayHello = "this is testing")
public class TestServiceImpl {

    public String testAnnotation(){
        TestInterface annotation = this.getClass().getAnnotation(TestInterface.class);
        return  annotation.sayHello();
    }
}
