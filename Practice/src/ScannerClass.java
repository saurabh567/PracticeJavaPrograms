import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
//Scanner class--- for printing string name use "next()" method of scanner class
//Scanner class-- for printing long string use "nextLine()" method of scanner class
//Scanner class--- for printing integer value use "nextInt()" method of scanner class
//Scanner class---- for printing character value use "next().charAt()" method of scanner class
//scanner class--- for printing long integer value like phone number use "nextLong" method of scanner class.
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.next();
		
//	System.out.println("Enter any longer string:");
//		String str=sc.nextLine();
		
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		
		System.out.println("Enter the gender:");
		char gender=sc.next().charAt(0);
		
		System.out.println("Enter the phone number:");
		long phone=sc.nextLong();
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Name:"+ name);
		//System.out.println("longname"+str);
		System.out.println("age:" + age);
		System.out.println("gender" +gender);
		System.out.println("phone no :"+ phone);
		
		
		
		
	}

}
