package com.kvtsoft.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SkiingCoach implements Coach {

	// create a field for setter
	private FortuneService fortuneService;

	// set default no-arg constructor
	public SkiingCoach() {
		System.out.println(">>Skiing Coach: inside default consrtuctor");

	}

	// inject fortuneService into the setter method.
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">>Skiing Coach: inside setFortuneService");
//		this.fortuneService = fortuneService;
//	}

	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">>Skiing Coach: inside doSomeCrazyStuff");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Squat Jump. Take the squat to the next level with a squat jump";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
