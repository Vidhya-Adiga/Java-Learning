package ai.neuron.stringexamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*This program takes input from the user and checks whether it contains all alphabets or not, 
 * if it has all alphabets then it returns true else false
 * */

public class StringPangram {
	
	public static Boolean isPangram(String s) {
		
		s=s.toLowerCase();
		
		Boolean outputStatus=true;
		
		for(char c='a';c<='z';c++) {
			if(!(s.contains(String.valueOf(c)))){
				
				outputStatus=false;
				break;
			}
		}
		
		
		return outputStatus;
		

		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		System.out.println(isPangram(s));

	}

}
