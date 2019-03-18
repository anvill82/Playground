package com.ivo.service;


//@Component
public class Test1 implements TestInterface {

    @Override
    public void printMe() {
        System.out.println(Test1.class);
    }
}
