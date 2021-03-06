package com.luv2code.springconfig.xmltype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Simple example how to config Spring with XML file.
 */
public class XmlTypeApp {
    public static void main(String[] args) {
        /** Show Spring from where it must take config*/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        /** Creating array of animals and ask it to run statements*/
        Animal[] animals = {
                context.getBean(Cat.class),
                context.getBean(Bird.class)
        };
        for (Animal a : animals) {
            System.out.printf("This %s is ", a.getType());
            a.move();
        }

        /** Creating some persons with some animals and ask them introduce themselfs*/
        Person personWithCat = context.getBean("personWithCat", Person.class);
        Person personWithBird = context.getBean("personWithBird", Person.class);

        personWithCat.introduce();
        personWithBird.introduce();

        context.close();
    }
}
