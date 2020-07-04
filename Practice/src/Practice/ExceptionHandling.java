package Practice;
//Exception handling with the help of try-catch block. try-catch is used for reporting also
public class ExceptionHandling {
//	int a=10;
//	 static ExceptionHandling obj;
	public static void main(String[] args) {

		
//un caught exception		
//int i=9/0;
//System.out.println(i);

		
//caught exception
		//Thread.sleep(2000);  //Thread is a class. sleep is a method
		
	//Note-Whenever we get NullPointerException,there is a guarantee that may be your object is not declared properly
		//or may be object reference got Null.
		
//		ExceptionHandling obj=new ExceptionHandling();
//		 obj=null;
//		System.out.println(obj.a);
	
	//System.out.println(obj.a);
		
		
		
		//Note--We have 3 differnt types of Exception handling
		
	//	1) try-catch block
		
		//you candot define try alone..try is a keyword
		/*Note----in the try catch block. Remember in try block "you have to keep the lines of codes that you know, will throw an 
		exception and in inside the catch block you will provide  the "Name of the excption".*/
		
		try {
			int i= 9/0;
		}
		catch(Throwable e) {
      // or, catch(ArithmeticException e) { //e is exceptionname reference
        
        e.printStackTrace();  //printStackTrace is a java method which tells us "what kind of exception" you want to tell to the user
        System.out.println(e.getMessage()); //getMessage will give us the actual message/error
        
        }
		System.out.println("ABC");
		}
	
//if you don't handle the code with try-catch block,then the program will be terminated and subsequent lines of code will not get executed	
	
	
	
	
	
	
	
	

}

