package ai.neuron.stringexamples;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
	
	public static void sortString(String s) {
		s=s.toLowerCase();
		
		char c[]=s.toCharArray();
		
		Arrays.sort(c);
		String str=new String(c);
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.replace(" ","");
		sortString(s);
				
		
		
	
		

	}

}
