package InterfaceConcept;

public interface USBank {
	int min_bal=100; // Static in nature

public void credit();     //line number 4,6,7 and 8--- these are the standard rules we have already defined
public  void debit();
public void transferMoney();
		
	
}

//A class can have Multiple parent interfaces. but a particular class can have only 1 parent class--NOTE

//Properties of Interface(Naveen Automation labs told)
//1) Only Method Decleration, No method body. we just declare the Method Prototype
//2) In Interface we can declare the variables, and varibles are by default Static in Nature
//3) Variable value will not be Changed.it is final/Constant in nature
//4) No Static method in Interface.( Example.. public static void debit();----Not allowed
     // because Inteface is a part of OOPS concept, so objects can not have static methods. 

//5) No "Main Method" in Interface.
//6) Interface is Abstract(We cannot Instantiate,Instantiate means we cannot create the objects of a class) in Nature.
//7)We cannot create the Objects of Interface.
