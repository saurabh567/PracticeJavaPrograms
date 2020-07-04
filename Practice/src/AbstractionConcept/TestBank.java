package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank hb= new HDFCBank();
		hb.credit();//it is coming directly from Bank class
	    hb.debit();
	    hb.loan();
	    hb.funds(); //funds method only be accesssed by HDFCBank reference varible.
	
	
	         Bank b=new HDFCBank();   //Dynamic polymorphism
	         b.loan();
	         b.credit();
	         b.debit();
	         //b.funds();---NOT allowed-beacuse funds method is only part of HDFCBank. 
	
	
	
	}

}
