package javainterview.questions;

import java.util.Scanner;
// program for Multiplication of two floating point number
public class FloatingMultiplication {

	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter first floatingpoint number:");
    float f1=sc.nextFloat();
    
    System.out.println("Enter second floatingpoint number:");
    float f2=sc.nextFloat();
    
    System.out.println("Multiplication of two floatingpoint number is:" + (f1*f2));
	
	
	
	}

}
