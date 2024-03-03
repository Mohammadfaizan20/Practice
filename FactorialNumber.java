package Basics;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,c,fact=1;
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		 n = s.nextInt();
		
		if(n<0)
			System.out.println("negative not allowed..");
		else {
			for(c=1;c<=n;c++) {
				fact = fact*c;
			}
			System.out.println("factorial of "+n+" is "+fact);
		}

	}

}
