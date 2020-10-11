package com.kvtsoft.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "10 laps in 10 minutes";
	}
}
