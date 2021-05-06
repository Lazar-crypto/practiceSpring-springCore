package com.razal.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach() {
	
	}
//	define constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get fortune
		return fortuneService.getFortune();
	}

	public void doMyStartUpStuff() {
		System.out.println("BaseballCoach: Inside method doMyStartUpStuff");
	}

	public void doMyCleanUpStuff() {
		System.out.println("BaseballCoach: Inside method doMyCleanUpStuff");

	}
}
