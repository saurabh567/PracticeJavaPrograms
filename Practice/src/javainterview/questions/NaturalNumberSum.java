package javainterview.questions;

public class NaturalNumberSum {

	public static void main(String[] args) {
		
		//natural number--1,2,3 and so on 
		int num=100;
		int sum=0;
		int sum1=0;
		//1+2+3+4.....+99+100
		
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
System.out.println("sum is:" +sum);
	

	System.out.println("*********************************");
	
	int k=1;
	while(k<=num) {
	sum1=sum1+k;
	k++;
	}
	System.out.println("sum is:" +sum);
	
	
	
	}

}
