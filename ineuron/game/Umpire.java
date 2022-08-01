package com.ineuron.game;

import java.util.Scanner;

public class Umpire {
	
	
	int guessValueFromPlayer1;
	int guessValueFromPlayer2;
	int guessValueFromPlayer3;
	int guessValueFromGuesser;
	
	void creationOfAllObjectsAndAssign() {
		
		Guesser g=new Guesser();
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		guessValueFromGuesser= g.guessNumber();
		guessValueFromPlayer1=p1.selectANumber();
		guessValueFromPlayer2=p2.selectANumber();
		guessValueFromPlayer3=p3.selectANumber();

	}
	
	void compare() {
		System.out.println("Player1 "+isPlayer1());
		System.out.println("Player2 "+isPlayer2());
		System.out.println("Player3 "+isPlayer3());
		
		if(!(guessValueFromGuesser==guessValueFromPlayer1 || guessValueFromGuesser==guessValueFromPlayer2 || guessValueFromGuesser==guessValueFromPlayer3) )
			System.out.println("Please try again");
	}
	

	
	String isPlayer1() {
		return guessValueFromPlayer1==guessValueFromGuesser?"Won":"Lost";
	}
	
	String isPlayer2() {
		return guessValueFromPlayer2==guessValueFromGuesser?"Won":"Lost";
	}
	
	String isPlayer3() {
		return guessValueFromPlayer3==guessValueFromGuesser?"Won":"Lost";
	}

}
