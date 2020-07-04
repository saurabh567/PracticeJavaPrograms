package javainterview.questions;



public class PrimeNumber {

	public static void main(String[] args) {
		
		
		//2,3,5,7....  2 is the lowest prime number in positive integer
	
	//FLAG-It usually acts as a boolean variable indicating a condition to be either true or false.
	
	int num=14;
	boolean flag=false;
	
	for(int i=2;i<=num/2; i++) { //for ex 13/2=6,so loop will start to 6 times from 2 to 6
		
	if(num%i==0) {
		flag=true;
		break;
	}
	}
	if(!flag) {
		System.out.println("number is prime:" +num);
	}
	
	else {
		System.out.println("number is prime:" +num);	
	}
}
}