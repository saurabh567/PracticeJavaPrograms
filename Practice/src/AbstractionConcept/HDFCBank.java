package AbstractionConcept;

public class HDFCBank extends Bank {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	
	public void loan() {
		System.out.println("HDFC--LOan method");
		
	}
/*note--credit and debit method which are present in Bank class,no need to define here,we can leave..so it is the advantage
   we can directly inherit from the Bank class*/


 public void funds() {
	 System.out.println("HDFC --funds");
 }


}
