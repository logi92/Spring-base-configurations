package com.luv2code.springconfig.annotationtype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Bean Component.
 */
@Component
public class Bird extends Animal {

    /**
     * @Value inject some values to parameters
     */
    public Bird(@Value("Bird") String type) {
        super(type);
    }

    @Override
    public void move() {
        System.out.println("flying!");
    }
}
