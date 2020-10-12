package com.kvtsoft.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImp implements FortuneService {

	@Override
	public String getFortune() {
		return "Here..Cookie for you";
	}

}
