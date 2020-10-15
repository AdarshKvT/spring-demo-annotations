package com.kvtsoft.springannotation;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

	// define init method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println(">>HockeyCoachImp: Do my startup stuff");
	}

	@PreDestroy
	public void doMyCleanUpStuff() {
		String uri = "F:\\eclipse-workspace\\spring-demo-annotations\\src\\fortuneFile.txt";

		try {

			Stream<String> steam = Files.lines(Paths.get(uri), Charset.defaultCharset());
			steam.forEachOrdered(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(">>HockeyCoachImp: Do my cleanup stuff");

	}

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
