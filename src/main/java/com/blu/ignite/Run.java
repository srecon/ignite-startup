package com.blu.ignite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.ws.Endpoint;

/**
 * Created by shamim on 14/02/16.
 */
public class Run {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-core.xml");
        Services services = (Services) ctx.getBean("servicesBean");

        Endpoint.publish("http://localhost:7001/invokeRules", services);
        System.out.println("Server start in Port .. 7001");
    }
}
