package Basics;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String str,sub = null;
		int c,length,i;
		
		System.out.println("enter the string...");
		str  = input.nextLine();
		
		length = str.length();
		
		for(c=0;c<length;c++)
		{
			for(i=1;i<=length-c;i++)
			{
				sub = str.substring(c,c+1);
				
			}
			System.out.println("substring are... : "+sub);
		}
	}
}
