package javainterview.questions;

import java.util.Scanner;

public class TableOfMultiplication {

	public static void main(String[] args) {
		//2*1=2
		//2*2=4
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int n=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n +"x" + i + "=" + (n*i));
		}
       
	 
	
	
	}

}
