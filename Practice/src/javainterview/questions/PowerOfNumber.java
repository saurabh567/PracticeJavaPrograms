package javainterview.questions;

public class PowerOfNumber {

	public static void main(String[] args) {
		int base=2;
		int exponent=4;
		
		long result=1;
		while(exponent!=0) {
			result*=base;  //result*base
			--exponent;
		}
		System.out.println(result);
		
		
		//System.out.println(Math.pow(base, exponent));
	}

}
