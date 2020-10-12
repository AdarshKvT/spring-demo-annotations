package com.kvtsoft.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class AnnotationDemoApp {

	public static void main(String[] args) {

		// read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the bean from the container
		// Coach theCoach = context.getBean("theTennisCoach", Coach.class);
		// Coach theCoach = context.getBean("soccerCoach", Coach.class);
		// Coach theCoach = context.getBean("swimmingCoach", Coach.class);
		// Coach theCoach = context.getBean("skiingCoach", Coach.class);
		Coach theCoach = context.getBean("surfingCoach", Coach.class);

		// call the method on bean
		String dailyWorkout = theCoach.getDailyWorkout();
		System.out.println(dailyWorkout);

		String dailyfortune = theCoach.getDailyFortune();
		System.out.println(dailyfortune);

		// close the context
		context.close();
	}

}
