package com.razal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from spring container (spring previously injects dependencies(helper objects) into bean)
		JudoCoach theCoach = context.getBean("myCoach",JudoCoach.class); /* Coach theCoach = (Coach) context.getBean("myCoach"); */ 
		 
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
//		Coach judoCoach = context.getBean("myJudoCoach",Coach.class);
//		
//		System.out.println(judoCoach.getDailyWorkout());
//		
//		System.out.println(judoCoach.getDailyFortune());
		
		context.close();
	}

}
