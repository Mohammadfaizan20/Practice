package Basics;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c,n,search,arr[];
		
		System.out.println("enter the number you want to insert into the array.");
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		arr = new int[n];
		
		for(c=0;c<n;c++)
			arr[c] = s.nextInt();
		
		System.out.println("enter value to find..");
		
		search = s.nextInt();
		
		for(c=0;c<n;c++)
			if(arr[c]==search)
			{
				System.out.println(search+" is located at "+(c+1)+".");
			break;
	}
	
	if(c==n)
		System.out.println(search+" not present ...");
	
	}

}
