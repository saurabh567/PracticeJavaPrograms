package AbstractionConcept;

public  abstract class Bank {  //abstract keyword is used  to define abstract class

	int amount=100;
	final int rate=10;   //we can define final variable
	static int loanRate=5;   //we can define static varible
	/*when to use Abstract class and when to use interface?
			for partial abstraction---use Abstract classes
			for 100% Abstraction-- use Interface(to hide the complete business logic,the complete implementation logic)

			Perfomance wise Abstract class are faster as comapred to Interface*/
	
	
	
		//Abstraction-Hiding the internal details(implementation logic) and showing only the functionality. Ex-A Phone call,or a message on phone
		//Abstraction---There are 2 ways to achieve Abstraction in java.
		//1) Abstract Classes (partial abstraction is only possible)
		//2) Interface(100% abstraction is possible)

	//We can not create the object of abstract classes.
	//Abstract class can have abstract methods as well as non abstract methods also with method body
	//In abstract class,atleast 1(one method )should be abstract in nature. 
	// Advantage of Abstract class that we can have both abstract method and non abstract method
	//Note---1 abstract method is compulsory in abstract classes
	/*Note--Through abstract classes we are NOT achieving 100% abstraction,means only partial abstraction,
	  beacause loan method is abstract but here  credit() and debit method is COMMON for all the Child classes*/
	
	public abstract void loan(); //abstract method--NO method body

	
	public void credit() {  //non abstract method
	System.out.println("Bank --Credit");	
	
	}

    public void debit() {
    	System.out.println("Bank-- debit");
    }

    
}
