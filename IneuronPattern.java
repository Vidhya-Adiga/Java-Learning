package com.ineuron.patterns;


public class IneuronPattern {

	public static void main(String[] args) {
		
		int n=10;
		for(int i=0;i<n;i++) {
			//For I
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0|| i==n-1 || j==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			//For N
			System.out.print("  ");
			
			for(int j=0;j<n;j++) {
				if(j==0|| j==n-1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			//For E
			System.out.print("  ");
			
			for(int j=0;j<n;j++) {
				if(i==0|| i==n-1 || i==(n-1)/2 || j==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			//For U
			System.out.print("  ");
			
			for(int j=0;j<n;j++) {
				if(j==0 && i!=(n-1)|| j==n-1 && i!=n-1  || i==n-1 && j!=0 && j!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			//For R
			System.out.print("  ");
			
			for(int j=0;j<n;j++) {
				if(j==0|| i==0 && j!=n-1 || j==n-1 && i!=0 && i<(n-1)/2 || i==(n-1)/2 && j!=n-1 || j==i-1 && i>=(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			//For O
			System.out.print("  ");
			
			for(int j=0;j<n;j++) {
				if(j==0 && i!=0 && i!=n-1|| j==n-1 && i!=0 && i!=n-1 || i==0 && j!=0 && j!=n-1 || i==n-1 && j!=0 && j!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			//For N
			System.out.print("  ");
			
			for(int j=0;j<n;j++) {
				if(j==0|| j==n-1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}	
			System.out.println();		
		}

	}

	}
