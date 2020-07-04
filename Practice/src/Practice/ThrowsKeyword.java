package Practice;
//Exception handling with the help of throws keyword
public class ThrowsKeyword {

	public static void main(String[] args) throws ArithmeticException {
		//throws keyword is always used when we have method chaining
// main method is calling sum. sum method is calling div,and div is generating an exception
/*div method is throwing exception to sum method...sum method is also throwing exception to main method as main method is calling sum method.
	so ultimately nobody is catching the exception. so finally the exception will be taken care by JVM.*/
		ThrowsKeyword obj=new ThrowsKeyword();
		
		obj.sum();
	System.out.println("ABC");
	}
	
	public void sum() throws ArithmeticException {
	div();
	}
	
	public void div() throws ArithmeticException {
		int i=9/0;// exception line
	}
	
	
	
	
	
	
	
	
	
	}



