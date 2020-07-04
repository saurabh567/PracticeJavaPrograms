package javainterview.questions;

import java.util.Scanner;

public class PositiveNegativeNumber {
//check weather a number is positive or negative
	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		 number=sc.nextInt();
		
		
		
		if( number>0.0) {
			System.out.println("Number is positive:"+number );
		}
		else if( number<0){
			System.out.println("Number is negative" + number);
		}
	
		else {
			System.out.println("number is neithe positive nor negative" +number);
		}
	System.out.println("*********************************************************************************");
	
double number1=12.33;
if(number1>0.0) {
	System.out.println("number is positive"+ number1);
}
else if(number1<0.0) {
	System.out.println("number is negative"+ number1);
}
	
else {
	System.out.println("number is zero"+ number1);
}
	
	
	
	
	
	
	
	
	
	
	
	}

}
