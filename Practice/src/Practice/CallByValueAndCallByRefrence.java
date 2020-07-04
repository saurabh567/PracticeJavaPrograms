package Practice;

public class CallByValueAndCallByRefrence {

	public static void main(String[] args) {
		CallByValueAndCallByRefrence obj= new CallByValueAndCallByRefrence();
		int x=10;
		int y=20;
		obj.testSum(x, y);
		

	}


 public int testSum(int a,int b) {
	 a=30;
	 b=40;
	 int c=a+b;
	 return c;
	 
	
}





}
