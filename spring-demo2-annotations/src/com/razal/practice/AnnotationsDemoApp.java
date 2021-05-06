package com.razal.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

	public static void main(String[] args) {

		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from spring container
		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("name of the team: " + theCoach.getTeam());
		
		
		Coach alphaCoach = context.getBean("tennisCoach",TennisCoach.class);
		
		System.out.println(theCoach == alphaCoach);
		System.out.println(theCoach);
		System.out.println(alphaCoach);

		
		//close context
		context.close();
	}

}
