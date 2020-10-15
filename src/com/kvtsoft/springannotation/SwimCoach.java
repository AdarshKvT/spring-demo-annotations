package com.kvtsoft.springannotation;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	// constructor for injection
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swin 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
