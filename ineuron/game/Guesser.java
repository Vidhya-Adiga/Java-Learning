package com.ineuron.game;

import java.util.Scanner;

public class Guesser {
	int guessNum;
	
	int guessNumber(){
		int temp;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hey Guesser! enter a number betweeen 0-9");
		
		temp=sc.nextInt();
		
		if(temp <=9 && temp >=0) {
			guessNum=temp;
			return guessNum;
		}
		else {
			System.out.println("Please enter correct number betwen 0-9");
			guessNumber();
//			System.exit(0);
		}

		return guessNum;
		
	}

}
