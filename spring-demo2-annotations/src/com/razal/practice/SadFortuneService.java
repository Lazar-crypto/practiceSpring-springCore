package com.razal.practice;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Unlucky day";
		
	}

}
