package com.kvtsoft.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoachImp implements Coach {

	// field injection
	@Autowired
	// @Qualifier("fortuneServiceImp")
	private FortuneService fortuneService;

	// default no-agr constructor
	public HockeyCoachImp() {
		System.out.println(">>HockeyCoachImp: Inside Default Constructor");
	}

//	// defining constructor injection
//	@Autowired
//	public HockeyCoachImp(@Qualifier("fortuneServiceImp") FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		System.out.println(">>HockeyCoachImp: Inside getDailyWorkout method");
		String dailyWorkout = "Practice 20 minutes Arm swings and circles";
		return dailyWorkout;
	}

	@Override
	public String getDailyFortune() {
		System.out.println(">>HockeyCoachImp: Inside getDailyFortune method");
		return fortuneService.getFortune();
	}
}
