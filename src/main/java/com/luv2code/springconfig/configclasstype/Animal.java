package com.luv2code.springconfig.configclasstype;

public abstract class Animal {
    private String type;

    public String getType() {
        return type;
    }

    public Animal(String type) {
        this.type = type;
    }

    abstract void move();
}
