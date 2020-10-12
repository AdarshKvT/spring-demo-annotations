package com.kvtsoft.springannotation;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImp implements FortuneService {

	// init Random object
	private Random rn = new Random();
	private String randomFortune;

	@Override
	public String getFortune() {
		try {

			// read the fortuneFile
			Stream<String> fortuneStream = Files.lines(
					Paths.get("F:\\eclipse-workspace\\spring-demo-annotations\\src\\fortuneFile.txt"),
					Charset.defaultCharset());

			// convert stream into a String array
			String[] fortuneArray = fortuneStream.toArray(String[]::new);

			// fetch the fortune based on random index
			int index = rn.nextInt(fortuneArray.length);

			randomFortune = fortuneArray[index];

			fortuneStream.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return randomFortune;
	}

}
