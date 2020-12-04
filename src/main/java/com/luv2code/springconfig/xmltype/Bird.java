package com.luv2code.springconfig.xmltype;

/**
 * Bird bean
 */
public class Bird extends Animal {
    public Bird(String type) {
        super(type);
    }

    @Override
    public void move() {
        System.out.println("flying!");
    }
}
