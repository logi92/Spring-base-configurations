package com.luv2code.springconfig.annotationtype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Bean Component.
 */
@Component
public class Person {
    private Animal cat;
    private Animal bird;

    public Animal getBird() {
        return bird;
    }

    public Animal getCat() {
        return cat;
    }

    /**
     * @Autowired release DI
     * @Qualifire show what bean exactly should be injected
     */
    @Autowired
    @Qualifier("cat")
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Autowired
    @Qualifier("bird")
    public void setBird(Bird bird) {
        this.bird = bird;
    }
}
