package Practice;                          //ENCAPSULATION concept
//Encapsulation is also called Data hiding
/*It is NOT mandatory to declare setter and getter always,if you don't define getter and setter, just define
private varibles,so that from outside the class no one can access it.But if you have to access the private varibles then getter and setter is required*/
public class EmployeeData {
	//to provide the high level security we use encapsulation in java
	//Enacapsulation is a part of OOPs concept.there are THREE object oriented programming concepts that is PIE
	//PIE-Polymorphism,Inheritance and Encapsulation
	//ques: how to implement Encapsulation??
	 
	//1) private data variable:so that thesevariables can not be accessed directly from outside the class
			private int ssn;
			private String empName;
			private int empAge;

	public static void main(String[] args) {
		EmployeeData emp=new EmployeeData();
		emp.setSsn(123456);
		emp.setEmpName("saurabh");
		emp.setEmpAge(25);
		System.out.println(emp.getSsn());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpAge());
		
		}
   //2) public setter and getter method: to set and get the values of the fields(to access private varible)
	
	//Above 3 private varibles and be accesed with public methods
//Getter and setter will be public always,if you make it private then you can only access within the class,then what 
	//is the purpose.
	//NOTE--Getter and Setter's methods are used to create, modify, delete and view the variables values
	
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;    //blue written ssn is class variable and red written ssn is local variable
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
