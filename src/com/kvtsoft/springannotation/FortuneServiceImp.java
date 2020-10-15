package com.kvtsoft.springannotation;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImp implements FortuneService {

	// init Random object
	private Random rn = new Random();
	private String randomFortune;
	private String pathname = "F:\\eclipse-workspace\\spring-demo-annotations\\src\\fortuneFile.txt";
	private List<String> arraylist;

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
		return pathname;
	}
}

//============(Second method for reading file)
//File file = new File(pathname);
//
//try {
//	BufferedReader reader = new BufferedReader(new FileReader(file));
//
//	arraylist = new ArrayList<String>();
//
//	String tempLine;
//	while ((tempLine = reader.readLine()) != null) {
//		arraylist.add(tempLine);
//	}
//
//} catch (FileNotFoundException e) {
//	e.printStackTrace();
//}