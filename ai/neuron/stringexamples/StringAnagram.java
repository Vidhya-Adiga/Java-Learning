package ai.neuron.stringexamples;

import java.util.Arrays;
import java.util.Scanner;

/* Anagram: Two string are said to be anagram if both contain same characters and they can be in  different order
 * 
 * Eg: race and care,  peek  and keep
 * 
 * */

public class StringAnagram {
	
	/* This function takes a string array and then checks the length of 2 string, if they are not equal returns false 
	 * else it converts both strings to lowercase and then to char arrays and then sort them and then compares,
	 *  returns true if both are equal else return false*/
	
	public static Boolean isAnagram(String[] s) {
		String s1=s[0];
		String s2=s[1];
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		else {
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			
			char []char1=s1.toCharArray();
			char []char2=s2.toCharArray();
			
			Arrays.sort(char1);
			Arrays.sort(char2);
			
			if(Arrays.equals(char1, char2)) {
				return true;
			}
			else {
				return false;
			}
			
		}	
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		String[] strArray=s.split(" ");
		
		System.out.println(isAnagram(strArray));
		
		
		

	}

}
