package ai.neuron.stringexamples;

import java.util.Scanner;

/*This programs takes input from the user and prints characters which are repeated.
 * 1) loop through the length of the string char and in inner loop we have to compare first character 
 * with other characters using inner loop,if its repeated then increment count and also replace all repeated 
 * values with 0, so that it won't be repeated
 */

public class DuplicateCharacters {
	
	public static void duplicateCharacters(String s) {
		s=s.toLowerCase();
		char[] cArray=s.toCharArray();
		
		int count;
		
		for(int i=0;i<cArray.length;i++) {
			
			count=1;
			for(int j=i+1;j<cArray.length;j++) {
				if(cArray[i]==cArray[j] && cArray[i]!=' ') {
					count++;
					cArray[j]=0;
				
				}
			}
			
			if(count>1 && cArray[i]!=0) {
				System.out.println(cArray[i]);
			}
			
		}
		
	
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		duplicateCharacters(s);

	}

	
}
