package com.razal.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired 
	@Qualifier("randomFortuneService") 
	private FortuneService fortuneService;
	
	
	@Value("sampionjoni")
	private String team;
	
	
	public TennisCoach() {
		System.out.println("no args constructor called");
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley!";
		
	}

	public String getTeam() {
		return team;
	}


	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	
	}

}
