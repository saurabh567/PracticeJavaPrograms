package javainterview.questions;

public class NumberOfDigits {
//Program to count the number of digits in an integer
	public static void main(String[] args) {
		
     //1234- 4 digits
		//123-3 digits
		
		int i=1456;
		String str=String.valueOf(i); //converted integer,to String
		System.out.println(str);
		int s=str.length();
		System.out.println(s);
	
	}

}
