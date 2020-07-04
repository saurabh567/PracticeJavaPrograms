package Inheritance;

public class CarTest {

	public static void main(String[] args) {
	Vehicle ve=new Vehicle();
	ve.engine();

	System.out.println("**************");
	Car c =new Car();
	c.start(); //Method overiding   over ridden method is called "compile time polymorphism" or Static polymorphism
	c.stop();
	c.color();
	c.refuel();
	c.engine();
	System.out.println("**************");
	
	Car c1=new Mercedes(); //child class object can be referred by parent class variable.It is called Dynamic Polymorphism or Runtime polymorphism or TOP CASTING.
	c1.refuel();
	c1.start();
	c1.stop();
	c1.color();
	System.out.println("**************");
	
	  Mercedes m1=(Mercedes) new Car(); // This is called Downcasting(degrading the parent class object(new Car())into child class object((Mercedes) new Car();)
     
	  
	 
	
	
	}

	
}
