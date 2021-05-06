package com.razal.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String dataArray[] = new String[10];
	
	public void readFromFile() {
		
		//load file
		File myFile = new File("arrayOfStrings.txt");
		String data = null;
		
		try {
			//read from file
			Scanner myReader = new Scanner(myFile);
			
			while(myReader.hasNextLine()) {
			 data = myReader.nextLine();
			 
			 
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		//load strings into an array
		dataArray = data.split(",");
		
	}
	
	
//	private String[] data = {
//			"Ruka ruci nismo Turci",
//			"Bez muke se pjesma ne ispoja,bez muke se sablja ne sakova",
//			"Vise srece drugi put"
//	};
	
	//create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		readFromFile();
		
		//pick a random string from the array
		int index = myRandom.nextInt(dataArray.length); //vraca random broj od 0 - data.length
		
		return dataArray[index];
		
	}

}
