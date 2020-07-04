 package Practice;

public class FinallyConcept {

	public static void main(String[] args) {
//		FinallyConcept obj=new FinallyConcept();
//		obj.test1();
		 //or 2nd way of calling,make the test1 method as static and call it directly inside main method
		test1();
		test2();
		division();
	
	}	
//note--Finally keyword is used in with the association of try-catch block.finally keyword is always used with try-catch block.
//note--finally block is executed after the try-catch block
//note-- doesn't materr if exception is coming or not,fianlly block will be executed always	
	
	
	// finally--it is a block
	public  static void test1() {
		try {
			System.out.println("inside test method");
		throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("inside catch block");
		}
		
		finally
		{
			System.out.println("inside finally block");
		}
	}
	
	/*Can finally block be used without catch?
			Yes, we can have try without catch block by using finally block*/
		public  static void test2(){
		try {
			System.out.println("inside test2");
		}
	finally {
		System.out.println("finally code in test2 method");
	}
	
	}
	
	
		public  static void division() {
			int i=10;
			try {
				System.out.println("inside try block");
				int k=i/0;
			}catch(ArithmeticException e) {
					System.out.println("inside catch block");
					System.out.println("divide by zero error");
				}
			finally {
				System.out.println("execute this code even after the exception");
			}
		}
		}
	
	
	
	


















