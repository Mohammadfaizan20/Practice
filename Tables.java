package Basics;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		
		for(int i=1;i<=10;i++) 
			System.out.print(n+"*"+i+"="+i*n);
		System.out.println(" ");
		
	}

}
