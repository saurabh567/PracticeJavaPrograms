package InterfaceConcept;

public interface Car {
	//Only final and static varibles are allowed in interface
	 final int wheels=4;  //if you remove final keyword also,by default also it is final
	 
	
	
	
	//Note--In Interface we have to achieve 100% Abstraction
	//Interface consist of ONLY abstract methods
	//in Interface method body is not allowed beacuse all the methods are abstract by default,NO need to write abstract keyword
// abstract means--no method body
// we cannot create the object of interface
	//NOTE--Both Abstract classes and Interface both are abstract in nature
public void start();
public void stop();
public void refuel();
	




}
