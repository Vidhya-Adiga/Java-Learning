package com.ineuron.game;

import java.util.Scanner;

public class Player {
	
int num;
	
	int selectANumber(){
		int temp;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hey Player! enter a number betweeen 0-9");
		
		temp=sc.nextInt();
		
		if(temp <=9 && temp >=0) {
			num=temp;
			return num;
		}
		else {
			System.out.println("Please enter correct number betwen 0-9");
			selectANumber();
		}
		return num;
		
	}

}
