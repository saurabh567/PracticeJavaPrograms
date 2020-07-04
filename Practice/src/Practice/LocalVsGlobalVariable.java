package Practice;

public class LocalVsGlobalVariable {
	//Scope of Global variable will be throughtout the program
	//Global variable or Class variable
	String name="Tom";
	int age=25;
			

	public static void main(String[] args) {
		
		int i =10; //local variable for main method 
		System.out.println(i);
	//if you want to access the global variables ,then you need to create the object of that class(LocalVsGlobalVariable)
		LocalVsGlobalVariable obj=new LocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
	
	}
     public void sum() {
    	 
    	 int i=15;
    	 int j=20;    //All 3 variables are local variables of sum method
    	 int age=25;
     }

}
