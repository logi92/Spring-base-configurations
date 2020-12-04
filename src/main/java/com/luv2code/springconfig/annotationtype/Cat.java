package com.luv2code.springconfig.annotationtype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Bean Component.
 */
@Component
public class Cat extends Animal {
    public Cat(@Value("Cat") String type) {
        super(type);
    }

    @Override
    public void move() {
        System.out.println("running!");
    }
}
