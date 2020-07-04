package Practice;

public class ThrowKeyword {

	public static void main(String[] args) {
	
//note--Throw keyword is used when we have to throw the exception deliberately(willingly).if i want to create my own Exception

//We can create our own Exception also.
		
		System.out.println("saurabh");
		try {
		throw new Exception("Ganesh Exception");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("mahesh");
	
	}

}
