package com.luv2code.springconfig.xmltype;

/**
 * Cat bean
 */
public class Cat extends Animal {
    public Cat(String type) {
        super(type);
    }

    @Override
    public void move() {
        System.out.println("running!");
    }
}
