package ai.neuron.stringexamples;

import java.util.Scanner;

/* This program is used to take a string from console and print reverse of the given string
 * Eg: Sree Vidhya
 * o/p: ayhdiV eerS
 * 
 *  */

public class StringReverse {
	
	public static String reverse(String s) {
		
		int len=s.length();
		String reverseString="";
		
		for(int i=len-1;i>=0;i--) { //trasversing the string from end and concating it to new variable
			reverseString=reverseString+s.charAt(i);
		}
		
		return reverseString;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String revString=reverse(s); //calling static function by passing a string to get reverse of it.
		System.out.println(revString);
		

	}

}
