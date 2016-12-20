package com.me;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kayuu
 */
public class ProviderMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application-context-provider-main.xml"});
        context.start();
        System.in.read();
    }
}
