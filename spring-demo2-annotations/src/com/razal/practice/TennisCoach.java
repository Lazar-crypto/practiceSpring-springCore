package com.razal.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //default bean id for TennisCoach -> tennisCoach,ako ne specifikujem id Componenta -> new TennisCoach()
@Scope("prototype")
public class TennisCoach implements Coach {

	// field injection,posle ovog nema potrebe ni za constructor,ni setter injection
	//spring kontejner sa notacijom Autowired ce da potrazi Component koji implementira FortuneService interface
	//sa Qualifier tacno kazemo koji objekat hocemo(ako imamo vise klasa koje implementiraju FortuneService)
	
	@Autowired //new 'objekat' koji implenetira FortuneService()
	@Qualifier("randomFortuneService") // new SadFortuneService
	private FortuneService fortuneService;
	
	
	@Value("sampionjoni")
	private String team;
	
	
	public TennisCoach() {
		System.out.println("no args constructor called");
	}
	
//	@Autowired 	// Spring kontejener nam pravi  tennisCoach(new HappyFortuneService)
	//Samo kad imamo jednu klasu koja implementira interfejs, koji se prosledjuje kao dependancy(FortuneService),
	//koristimo Autowired.
	//spring kontejner sa notacijom Autowired ce da potrazi Component koji implementira FortuneService interface
//	public TennisCoach(FortuneService fortuneService) {
//		System.out.println("args constructor called");
//		
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired // moze za bilo koji metod ne samo za setter
//	public void setFortuneServicebllbaslbaslbla(FortuneService fortuneService) {
//		System.out.println("Setter method called");
//		
//		this.fortuneService = fortuneService;
//	}

	
	
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
