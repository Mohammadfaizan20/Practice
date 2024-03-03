package Basics;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		if(x%2==0)
			System.out.println(x+" is even");
		else  
			System.out.println(x+" is odd");
		
		
	}

}
