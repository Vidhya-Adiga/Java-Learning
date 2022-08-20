package ai.neuron.stringexamples;

import java.util.Scanner;

/* This program is to take a string from user and print the words in reverse manner 
 * Eg: Sree Vidhya 
 * o/p: Vidhya Sree
 * 
 * */

public class StringWordsReverse {
	
	public static String wordReverse(String s) {
		
		
		 String []strArray=s.split(" ");
		 int len=strArray.length;
		 String outStr="";
		 
		 for(int i=len-1;i>=0;i--) {
			 outStr=outStr+strArray[i]+" ";
		 }
		 	
		 return outStr;
		 
		 
	
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		System.out.println(wordReverse(s));

	}

	

}
