package ai.neuron.stringexamples;

import java.util.Scanner;

/* This program is to take a string from user and print the words and characters in reverse manner by preserving the words position
 * Eg: Sree Vidhya 
 * o/p: eerS ayhdiV
 * 
 * */

public class StringWordsCharactersReverse {
	
	public  static String strCharReverse(String s) {
		
		String outStr="";
		String[] strArray=s.split(" ");
		
		for(int j=0;j<=strArray.length-1;j++) {
			String revStr=StringReverse.reverse(strArray[j]);
			outStr=outStr+revStr+" ";
		}
		
		return outStr;
		
	}


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		System.out.println(strCharReverse(str));

	}

}
