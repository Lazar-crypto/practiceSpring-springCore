package com.razal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//bean scope
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
//		
//		Coach theCoach = context.getBean("myCoach",Coach.class);
//		
//		Coach alphaCoach = context.getBean("myCoach",Coach.class);
//		
//		System.out.println("Pointing to the same object: " + (theCoach == alphaCoach));
//		
//		System.out.println("Memory location for theCoach: " + theCoach);
//		System.out.println("Memory location for alphaCoach: " + alphaCoach);
		
		//bean life cycle
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach",Coach.class);

		context.close(); // zove metod doMyCleanUpStuff
	}

}
