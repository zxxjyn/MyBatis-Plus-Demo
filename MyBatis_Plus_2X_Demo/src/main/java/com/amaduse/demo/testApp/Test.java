package com.amaduse.demo.testApp;

import com.amaduse.demo.service.Impl.TestServiceImpl;

public class Test {
    public static void main(String[] args) {
        TestServiceImpl testService = new TestServiceImpl();
        System.out.println(testService.testAnnotation());

    }
}
