package Practice;
//other source code
 public class EncapsulationConcept {

	private int emp_id; //data hiding
	public void setEmp(int eid) {
		emp_id=eid;
	}

	public int getEmp() {
		return emp_id;
	}

 }
class Company{
	
	public static void main(String[] args) {
		EncapsulationConcept e= new EncapsulationConcept();
		e.setEmp(101);
	
		System.out.println(e.getEmp());
	}
}	
	
	/*Encapsulation-Enacapsulation is a mechanism of Wrapping up of data(variables) and code acting on data(methods) together into a single unit


		Steps to achieve Encapsulation

		1) Declare the Variables of a class as private.
		2) provide public setter and getter method to modify and view the varibles values */

	/*Data hiding-- if we apply "private modifier" before any variable,then this is called data hiding
                                     or
  In encapsulation ,the variables of a class will be hidden from the other classes,and can be accessed only through the methods of their current class.this concept is 
  called Data hiding.*/
	
	//Note-- Data Hiding is a sub-part of Encapsulation
		
		//Setter method---used to modify the data.(setting the values inside the data)
		//Getter method--used to view the data
	
	


