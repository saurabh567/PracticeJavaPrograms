package Practice;

public class FinalizeConcept {
	
	public void finalize() {
		System.out.println("finalize method");
	}
    // finalize-- it is a method
	
	
	public static void main(String[] args) {
		/*finalize--it is something related to Garbage collector.it is used to perform "cleanup memory processing"

		inside the memory there is a lot of garbage/objects are there which doesn't have any references

		if we declare particular method as a "finalize",then it will start cleaning up the process */

	//garbage collector will come and destroy all the objects inside the memory,which doesn't have any reference.
	
	//you can call Garbage collector manually also
	
	//finalize method is called just before the garbage collector for the clean up processing
	
		FinalizeConcept f1=new FinalizeConcept();
		FinalizeConcept f2= new FinalizeConcept();
		
		f1=null;
		f2=null;
		System.gc();   //calling the garbage collector method
	
	
	/*note--- 1)finally is a block
		      
		      2) final is a keyword

              3) finalize is a method */
	
	
	
	}

}
