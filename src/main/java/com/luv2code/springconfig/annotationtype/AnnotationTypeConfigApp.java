package com.luv2code.springconfig.annotationtype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Simple example how to config Spring with Annotations.
 */
public class AnnotationTypeConfigApp {
    public static void main(String[] args) {
        /** Show Spring from where it must take config*/
        ApplicationContext context = new AnnotationConfigApplicationContext(SimpleAnnotationConfig.class);

        /** Creating array of animals and ask it to run statements*/
        Animal[] animals = {
                context.getBean(Cat.class),
                context.getBean(Bird.class)
        };

        for (Animal a : animals) {
            System.out.printf("This %s is ", a.getType());
            a.move();
        }

        /** Creating person with some animals and ask them to move*/
        Person person = context.getBean(Person.class);
        person.getBird().move();
        person.getCat().move();
    }
}
