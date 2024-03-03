package Basics;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n ;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		
		while(((n=s.nextInt())!=0))
		{
			System.out.println("you enterd "+n);
			System.out.println("enter a number");
			
		}
		System.out.println("you enterd 0 thats why u out of the loop...");
	}

}
