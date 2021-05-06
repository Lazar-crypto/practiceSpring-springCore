package com.razal.practice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //umesto xml fajla 
@ComponentScan("com.razal.practice")//SKENIRA anotacije //isto imamo i u xmlu   <context:component-scan base-package="com.razal.practice"></context:component-scan>
public class SportConfig {

	
	//OVDE JE SAD MOGUCE DEFINISATI BEANOVE I ONDA NAM NE TREBAJU NI ANOTACIJE
	//LAKSE SA ANOTACIJAMA
}
