package Practice;

public class StaticAndNonStaticConcept {

	String name="Tom"; //non static global variable
	static int age =25; //Static variable
	
	
	public static void main(String[] args) {
		
		// How to call static method and variable??
		//There are 2 ways to call static variable and static method
		//1)By direct calling
		sum();
		
		//2) Calling by classname.
		StaticAndNonStaticConcept.sum(); // syntax-classname.methodname
		
		//calling static variable below
		System.out.println(age); //1st way of calling static variable
		System.out.println(StaticAndNonStaticConcept.age); //2nd way of calling static variable

	//calling non static method
		
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
	
	//Note---One common and separate memory allocation is done with Static methods and Static varaibles in java memory
	
	
	
	}
  public void sendMail() { //non static method
	System.out.println("send mail method");  
  }
 
  public static void sum() { //static method
	System.out.println("sum method");  
  }


}
