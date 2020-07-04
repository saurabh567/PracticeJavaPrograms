package InterfaceConcept;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	BMW b=new BMW();
	b.start();
	b.stop();
	b.refuel();
	b.theftSafety();
	
	
	Car c=new BMW(); //Dynamic polymorphism--Child class object can be referred by parent class reference variable
	c.start();
	c.stop();
	c.refuel();
	//c.theftSafety(); NOT allowed as this feature is present only in BMW class and BMW not allow "CAR inteface" reference varible 
	//BMW will not allow any parent reference varible, to access own methods of BMW
	}

}
