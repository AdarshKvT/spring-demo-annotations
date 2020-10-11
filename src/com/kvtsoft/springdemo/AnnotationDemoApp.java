package com.kvtsoft.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class AnnotationDemoApp {

	public static void main(String[] args) {

		// read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the bean from the container
		// Coach theCoach = context.getBean("theTennisCoach", Coach.class);
		Coach theCoach = context.getBean("soccerCoach", Coach.class);

		// call the method on bean
		String dailyWorkout = theCoach.getDailyWorkout();
		System.out.println(dailyWorkout);

		// close the context
		context.close();
	}

}
