package Basics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long reverse=0;
		
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		
		while(n!=0)
		{
			reverse = reverse*10;
			reverse = reverse+n%10;
			n=n/10;
		}
		System.out.println("reverse of "+n + " is "+reverse);
	}

}
