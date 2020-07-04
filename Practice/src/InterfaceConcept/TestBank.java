package InterfaceConcept;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);   //getting the value by interface name
		
		
		HSBCBank hs=new HSBCBank();
		hs.credit();          
		hs.debit();            //Compile time polymorphism{as overidden methods are called)
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
	


	//Dynamic polymorphism---Child class object can be referred by parent Interafce reference variable
	    
                USBank b =new HSBCBank();
                b.credit();
                b.debit();         // Only the overidden methods will be called(those methods which are present in interface)
                b.transferMoney();
               //b.educationLoan(); //---NOT allowed 
                
	 }
	 
	      

}

