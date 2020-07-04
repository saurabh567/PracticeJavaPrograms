package Practice;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj =new MethodOverloading();
		obj.add();
		obj.add(6);
		obj.add(6, 8);
		
	}
	// Note--Main method can be overloaded it means, we can overload main method also. 
		//Note--Duplicate methods are not allowed with same method name and with same parameter
	// Note--same method name with same number of parameters but different datatypes can be overloaded
	//Note--We can not create a method inside a method
	
	public void add() { //0 input parameter
		System.out.println("add method with zero argument");
	}
	
	public void add(double d) {
		System.out.println(d);
		
	}
	 public void add(int i) { //1 input parameter
		 System.out.println("add method with one argument");
		 System.out.println(i);
	 }
	
	public  void add(int j, int k) { //2 input parameter
		System.out.println(" add method with two arguments");
	   System.out.println(j+k);	

	}
}

//This above technique is called Method overloading...as it has same method name but differnt in parameters
