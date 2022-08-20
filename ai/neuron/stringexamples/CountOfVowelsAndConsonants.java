package ai.neuron.stringexamples;

import java.util.Scanner;

public class CountOfVowelsAndConsonants {
	
	public  static void countOfVAN(String s) {
		String vowels="aeiou";
//		char sArray[]=s.toCharArray();
		int v=0;
		int con=0;
		
		s=s.toLowerCase();
		char[] sArray=s.toCharArray();
		for(char c:sArray) {
			if(c>='a' && c<='z') {
				if(vowels.contains(String.valueOf(c))) {
					v++;
				}
				else {
					con++;
				}
			}
			else {
				System.out.println("String contains special character, please enter only characters between a-z");
				return;
			}
		}
		
		System.out.println("Vowels: "+ v+ " Consonants: "+con);
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		countOfVAN(s);

	}

}
