package Basics;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter first string /n");
		String first = s.nextLine();
		System.out.println("enter second string");
		String second  =s.nextLine();
		
		if(first.compareTo(second)>0)
			System.out.println("string greate then first string...");
		else if (first.compareTo(second)<0) 
			System.out.println("string less then first");
		else 
			System.out.println("both are ewual");
		

	}

}
