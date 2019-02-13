package com.amaduse.demo.service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestInterface {
    String sayHello() default "hello";
//    List<String> sayWorld() default ;
    String[] sayWords() default {""};
}
