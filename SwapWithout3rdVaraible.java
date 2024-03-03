package Basics;

public class SwapWithout3rdVaraible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=4;
		int y=5;
		
		System.out.println("before :"+x+"  "+y);
		
		x = x+y;
		y = x-y;
		x = x-y;
	
		
		System.out.println("after  :"+x+"  "+y);

	}

}
