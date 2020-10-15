package com.kvtsoft.springannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppDemo {

	public static void main(String[] args) {

		// read the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the bean
		Coach theCoach = context.getBean("hockeyCoachImp", Coach.class);

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
