package Practice;

public class FunctionsInjava {

	public static void main(String[] args) {  //here we have only 1 main method or you can say 1 main function
	
		FunctionsInjava obj=new FunctionsInjava();
		//one object will be created ,obj is the object reference variable.
	//after creating the object ,the copy of all non stattic methods(test(),pqr(),qa(),division()) will be given to this object
	
	obj.test(); //calling test method
int m=obj.pqr(); //obj.pqr will give or store the value in "m"
	System.out.println(m);
  
	String s3=obj.qa(); // Seleniu value will be given to "obj.qa" and "obj.qa" will give or store the value in "s"
	System.out.println(s3);
	
int n=obj.division(100, 25);
System.out.println(n);
	}
		//Keep in mind------> Functions and Methods, both are SAME thing in Java
        
	//Keep in mind--- if you have to call "non static methods",then compulsory you have to "create the object"
	
	//Keep in mind---Main method is void because we never write "return" statment inside the main method.
		//syntax of Creating Method----> Access modifier,returntype,methodname
		// ()---bracket indicates method.
	  //her in below method return type is-void
	//non static method	
	public void test() { //no input,no output
			System.out.println("test method");
			
		}
	  
		//void---void does not return any value
		//here in below method--return type is-int
		//non static method
		public int pqr() {  //no input,some output
			System.out.println("PQR method");
			int a=10;
			int b=20;
			int c= a+b;
			// i  want to return something from this particular method, so how to get the return from method--that'why using return method
			return c;
			
		}
	  //non static method
      public String qa() { //no input,some output
    	  System.out.println("qa method");
    	  String s4="selenium";
    	  return s4;
     
      }

    //x,y---are input parameters/arguments  
    //non static method
      public int division(int x,int y) { //some input,some output
    	System.out.println("division method");
    	int d=x/y;
    	
    	return d;
    	
    }


}


