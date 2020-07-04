package Practice;

public class Bus {
	
	//class variables
	int model;    //both variables are called Global variable or class variable
	int wheel;

	//Note--whatever variable we declare,each and every variable(copy) is distributed among its objects
	//Here "model" and "wheel" variable copy is distributed to objects
	
	public static void main(String[] args) {
		
		Bus a= new Bus();   //here "new Bus" is called object of Bus class---Note thi point
		//a= object reference variable---(Note this point)
		//new keyword is used to create the object
		
		
		
		a.model=2015;  //initialized the value
		a.wheel=4;
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		Bus b=new Bus();    //b----Object reference variable,it can be anyname whatever you want
		b.model=2016;
		b.wheel=4;
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		Bus c= new Bus();
		c.model=2017;
		c.wheel=12;
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		
		
		
		
		
	}

}
