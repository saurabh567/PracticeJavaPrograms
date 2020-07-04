package Constructor;

public class ConstructorConcept {
	//our main purpose is how to initialize the properties of the class with the help of "this" keyword and constructor.
	
//constructor is also used to initialize class varibles
	String name; //here "name"and "age" is Class Varible or Global Variable or Instance Varible.
	int age;
	
	public ConstructorConcept() { //it is a default Constructor,as it has zero parameter
	System.out.println("This is a default constructor");	
	}

	public ConstructorConcept(int i) { //1 parameter constructor.constructor overloading
		System.out.println("1 parameter constructor");
		System.out.println(i); //10 will be given to i, and i value will be printed
	}
	
	public ConstructorConcept(int i,int j) { //2 parameter constructor.constructor overloading
		System.out.println("2 parameter constructor");
		System.out.println(i+ " "+j);
	}
	
	
	public ConstructorConcept(String name, int age) { //here "name" and "age" is local varible) 
	this.name=name;// this.classvariable =localvariable
	this.age=age;  //Here we used "this" keyword because we have pass the values(tom,25) to our class variable 
	}
	public static void main(String[] args) {
		
		ConstructorConcept obj =new ConstructorConcept(); //default constructor will be called
		ConstructorConcept obj1 =new ConstructorConcept(10);
		ConstructorConcept obj2 =new ConstructorConcept(20,30);
		ConstructorConcept obj3 =new ConstructorConcept("Tom",25);//we intialized local variable here
		//this keyword--"this" means current class
		
		
		System.out.println(obj3.name);
		System.out.println(obj3.age);
		
		//how exactly we can call the constructor of any class??---for that create object
		

	}

}
