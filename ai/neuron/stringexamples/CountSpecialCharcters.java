package ai.neuron.stringexamples;

import java.util.Scanner;

public class CountSpecialCharcters {
	
	public static void specialCharacters(String s) {
		int count=0;
		s=s.toLowerCase();
		
		char cArray[]=s.toCharArray();
		for(char c:cArray ) {
			if(!(c>='a' && c<='z')) {
				count++;
			}
		}
		
		System.out.println("Number of special characters are "+count);
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		specialCharacters(s);

	}

	
}
