package Basics;

public class StarsPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row,numberOfStars=10;
		
		for(row=1;row<=10;row++) {
		for(numberOfStars=1;numberOfStars<=row;numberOfStars++) {
				System.out.print("*");
		}
		System.out.println();
		}

	}

}
