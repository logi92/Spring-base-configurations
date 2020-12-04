package com.luv2code.springconfig.configclasstype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration tell us that it is configuration class
 */
@Configuration
public class SimpleConfig {

    /**
     * @Bean tell us that this method return bean
     */
    @Bean
    public Cat cats(){
        return new Cat("Cat");
    }

    @Bean
    public Bird birds(){
        return new Bird("Bird");
    }

    @Bean(name = "personWithCat")
    public Person personWithCat(){
        Person person = new Person();
        person.setAnimal(cats());
        person.setName("Jhon");
        return person;
    }

    @Bean(name = "personWithBird")
    public Person personWithBird(){
        Person person = new Person();
        person.setName("Jane");
        person.setAnimal(birds());
        return person;
    }
}
