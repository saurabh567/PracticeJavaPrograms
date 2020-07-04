package Inheritance;

public class Grandson extends Son {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//This Grandson class can acquire/inherit both the properties of son class and Grandfather class.
//This is called Multilevel inheritance.
		
		
		Grandson gs = new Grandson();
		gs.activities();
		gs.city();
		gs.country();
		System.out.println(gs.a);
		
	
	
	
	
	
	}

}
