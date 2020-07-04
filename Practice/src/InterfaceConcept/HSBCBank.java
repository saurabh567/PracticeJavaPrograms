package InterfaceConcept;

public class HSBCBank implements USBank,BrazilBank {  //we are achieving "Multiple Inheritance"
 //Is-a-relationship--means we are talking about interface
	
	// if you want to make a relationship between a Interface and class like here between(USBBank interface and HSBCBank class)
// then implements keyword is used to make a relatipship between an interface and a class

//Note--if a class is implementing any Interface,then it is mandatory to define/overide all methods of interface.	

	//methods overiding from USBank
  public void credit() {
	  System.out.println("hsbc credited");
	}

  public void debit() {
      System.out.println("hsbc debited");
  }
 
  public void transferMoney() {
	  System.out.println("hsbc transfer money");
  }

  //Separate methods of HSBCBank class
   public void educationLoan() {   //own method of HSBC bank
	System.out.println("hsbc edu loan provided");
   }
  
   public void carLoan() {
	   System.out.println("car loan distributed");
   }
  //Brazil Bank method: overiding from Brazil bank
   public void mutualFund() {
	   System.out.println("hsbc mutual fund ");
   }
}
