package com.kvtsoft.springannotation;

public class SadFortuneServiceImp implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your sad day. Get lost!!";
	}

}
