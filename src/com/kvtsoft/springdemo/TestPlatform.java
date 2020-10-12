package com.kvtsoft.springdemo;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TestPlatform {

	public static void main(String[] args) {
		try {

			System.out.println("init");
			File file = new File("F:\\eclipse-workspace\\spring-demo-annotations\\src\\foruneFile.txt")
					.getAbsoluteFile();
			Path filePath = file.toPath();
			System.out.println("filePath" + filePath);

//			Stream<String> stream = Files
//			.lines(Paths.get("F:\\eclipse-workspace\\spring-demo-annotations\\src\\foruneFile.txt"));
			Stream<String> lines = Files.lines(filePath, Charset.defaultCharset());
			System.out.println(lines);

			String[] fortuneArray = lines.toArray(String[]::new);
			System.out.println(fortuneArray[1]);

		} catch (Exception e) {
			e.getMessage();
			System.out.println(e.getMessage());
		}

	}

}
