package com.ineuron.game;

import java.util.Scanner;

public class GameLauncher {

	public static void main(String[] args) {
		
		Umpire u= new Umpire();
		boolean choice=true;
		while(choice) {
			System.out.println("Do you want to play game(y/n) ");
			Scanner s=new Scanner(System.in);
			char c=s.next().charAt(0);
			if(c=='y') {
				u.creationOfAllObjectsAndAssign();
				u.compare();
			}
			else if(c=='n') {
				System.exit(0);
			}
			else {
				System.out.println("Please enter y or n");
			}
			
		}
		

		}
		
	}


