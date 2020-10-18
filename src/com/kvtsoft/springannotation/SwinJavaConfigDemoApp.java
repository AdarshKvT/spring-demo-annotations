package com.kvtsoft.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwinJavaConfigDemoApp {

	public static void main(String[] args) {

		// read the configuration from java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfiguration.class);

		// retrieve the bean
		// Coach theCoach = context.getBean("hockeyCoachImp", Coach.class);
		Coach theCoach = context.getBean("swimCoach", Coach.class);

		// check the scope (prototype) of bean by printing the memory of the objects
		System.out.println("theCoach>>" + theCoach);

		// call the methods on the bean
		String dailyWorkout = theCoach.getDailyWorkout();
		System.out.println(dailyWorkout);

		String dailyFortune = theCoach.getDailyFortune();
		System.out.println(dailyFortune);

		// close the context
		context.close();
	}

}
