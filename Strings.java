package Basics;

import java.lang.reflect.Method;
import java.lang.runtime.ObjectMethods;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "            my name is faizan         ";
//		String s2 = s1.replace("faizan", "imran");
//		
//		System.out.println(s2);
//		
//		int indexOf = s1.indexOf('i',9);
//		
//		System.out.println(indexOf);
		
		String [] words = s1.split("\\s");
		for(String w :words)
			System.out.println(w);
		
		
		
		String trim = s1.trim();
		System.out.println(trim);
		
		String s3 = "faizan is my another       name ewhich call ne";
		 System.out.println(s3+s1.trim());
		 
		
			 
		 }
		
		

	}

}
