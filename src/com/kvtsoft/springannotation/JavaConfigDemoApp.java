package com.kvtsoft.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read the configuration from java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfiguration.class);

		// retrieve the bean
		// Coach theCoach = context.getBean("hockeyCoachImp", Coach.class);
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// check the scope (prototype) of bean by printing the memory of the objects
		System.out.println("theCoach>>" + theCoach);

		// call the methods on the bean
		String dailyWorkout = theCoach.getDailyWorkout();
		System.out.println(dailyWorkout);

		String dailyFortune = theCoach.getDailyFortune();
		System.out.println(dailyFortune);

		String email = theCoach.getEmail();
		System.out.println(email);

		String team = theCoach.getTeam();
		System.out.println(team);
		// close the context
		context.close();
	}

}
