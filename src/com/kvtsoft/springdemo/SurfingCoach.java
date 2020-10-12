package com.kvtsoft.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SurfingCoach implements Coach {

	// inject property file field values
	@Value("${foo.email}")
	@Autowired
	@Qualifier("fortuneServiceImp")
	private String email;

	@Value("${foo.team}")
	@Autowired
	@Qualifier("fortuneServiceImp")
	private String team;

	// field injection
	@Autowired
	@Qualifier("randomFortuneServiceImp")
	private FortuneService fortuneService;

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Front squats for 10 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
