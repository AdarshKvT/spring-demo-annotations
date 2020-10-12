package com.kvtsoft.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneServiceImp implements FortuneService {

	// create a string array of fortunes
	String[] fortuneArray = { "The secret of getting ahead is getting started.",
			"The secret of getting ahead is getting started.", "You always pass failure on the way",
			"No one is perfect - that's why pencils have erasers." };

	// create random number generator
	private Random rn = new Random();

	@Override
	public String getFortune() {

		// pick up a random fortune from the array
		int index = rn.nextInt(fortuneArray.length);
		String fortune = fortuneArray[index];
		return fortune;
	}

}
