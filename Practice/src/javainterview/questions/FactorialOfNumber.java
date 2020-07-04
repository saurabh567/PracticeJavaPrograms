package javainterview.questions;

public class FactorialOfNumber {

	public static void main(String[] args) {
		//5!---5*4*3*2*1=120
		
		int num=10;
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
System.out.println("factorial of number:" + fact);
	}

}
