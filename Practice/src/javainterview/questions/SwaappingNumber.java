package javainterview.questions;

public class SwaappingNumber {
//Program for Swapping of two number
	//you can do this by creating a "temp" variable
	
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
//		System.out.println("a=" +a);
//		System.out.println("b=" + b);
//		System.out.println("before swapping");
//		
//         int temp;
//         temp=a;
//         a=b;  //Giving the value of j, to i
//         b=temp;
//         
//        System.out.println("a=" +a);
// 		System.out.println("b=" + b);
// 		System.out.println("after swapping");
		
		
		//Swapping without using 3rd variable
		
		System.out.println("a=" +a);
		System.out.println("b=" + b);
		System.out.println("before swapping");
		
		a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b;  //30-10=20
		
		
		System.out.println("a=" +a);
		System.out.println("b=" + b);
		System.out.println("after swapping");
			
		
	
	
	
	}

}
