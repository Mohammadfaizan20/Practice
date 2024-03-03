package Basics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String str,reverse="";
		int length,i;
		
		System.out.println("enter the string...");
		str  = input.nextLine();
		length = str.length();
		
		for(i=length-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(length);
		System.out.println(reverse);
		
		StringBuffer a =new StringBuffer("my name is faizan");
		System.out.println(a.reverse());
		

	}

}
