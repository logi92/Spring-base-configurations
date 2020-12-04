package com.luv2code.springconfig.xmltype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlTypeApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        SimpleBean simpleBean = context.getBean(SimpleBean.class);
        simpleBean.doSomething();
    }
}
