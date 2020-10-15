package com.kvtsoft.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("com.kvtsoft.springannotation")
public class SportsConfiguration {

	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneServiceiImp() {
		return new SadFortuneServiceImp();
	}

	// define bean for swim coach and inject dependencies
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneServiceiImp());
	}

}
