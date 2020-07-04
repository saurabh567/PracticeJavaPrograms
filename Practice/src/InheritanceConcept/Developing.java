package InheritanceConcept;

public class Developing implements Bankingclient,Domainclient {
//Now the Developing class is responsible to implement "ALL" methods of Bankingclient.
//Note--One class can implements more than one Interfaces. and interface are separated by comma(,)	
	
	
	public static void main(String[] args) {
	Developing d=new Developing();  // d is responsible to call all the methods of developing class
	d.checkingbalance();     //objectnmae.methodname--Synatax for calling methods.
	d.paycreditcard();
	d.transferbalance();
	d.login();
	Bankingclient dr=new Developing(); // dr is responsible only  to call all the methods present in the Bankingclient Interface
		        //this mechanism is called "Runtime polymorphism"
	             //We can not call dr.login here,beacuse login method is not present in Bankingclient interface

	
	Domainclient dc=new Developing();
	dc.investment();  //Only Domainclient methods will be called here
	
	}

	public void paycreditcard() {
		System.out.println("paycredit card implemented");
		
	}

	public void transferbalance() {
		System.out.println("transfer balance implemented");
		
	}

	public void checkingbalance() {
		System.out.println("checking alance implemented");
		
	}
//We can add our own new methods in this class which is unique to Developing class only--see below
	
	public void login() {
		
		System.out.println("logged in");
	}


public void investment() {
	System.out.println("investing something");
}



}
