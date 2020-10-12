package com.kvtsoft.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class SwimmingCoach implements Coach {

	// field
	private FortuneService fortuneService;

	// create the constructor for the injection
	@Autowired
	public SwimmingCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	// Defining no-arg default constructor
	public SwimmingCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Under water dive for 10 mintues";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
