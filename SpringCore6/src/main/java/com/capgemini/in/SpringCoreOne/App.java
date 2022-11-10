package com.capgemini.in.SpringCoreOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
    	Sim sim = context.getBean("sim", Sim.class);
    	sim.calling();
    	sim.browsing();
    }
}
