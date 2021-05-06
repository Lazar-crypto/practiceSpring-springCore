package com.razal.springdemo;

public class JudoCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public JudoCoach() {
		System.out.println("Inside no args constructor");
	}
	
	//za konstruktor injection
	public JudoCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Inside args constructor");
	}

	//za setter injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("JudoCoach: inside setter method - FortuneService" );
		this.fortuneService = fortuneService;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("JudoCoach: inside setter method - EmailAdress" );
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("JudoCoach: inside setter method - Team" );
		this.team = team;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {

		return "Do 100 uchi-comi and 50 nage-comi";
		
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
}
