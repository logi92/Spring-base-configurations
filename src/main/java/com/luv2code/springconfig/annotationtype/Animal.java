package com.luv2code.springconfig.annotationtype;

public abstract class Animal {
private String type;

    public String getType() {
        return type;
    }

    public Animal(String type) {
        this.type = type;
    }

    public abstract void move();

}
