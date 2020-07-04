package javainterview.questions;

import java.util.Scanner;

public class PrintInteger {
//Program to print an integer(Entered by the user)
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number:");
	
		
		int num=sc.nextInt();
		System.out.println("you entered:" +num);
	}

}
