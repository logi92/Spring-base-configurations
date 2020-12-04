package com.luv2code.springconfig.xmltype;

/**
 * Person bean
 */
public class Person {
    private String name;
    private Animal animal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void introduce() {
        System.out.printf("Hello, my name is %s, and i have a %s\n", name, animal.getType());
    }
}
