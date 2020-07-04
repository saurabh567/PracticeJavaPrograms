package Practice;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x="100";
	System.out.println(x+20);
		//	i want convert this String into integer. For this we will use Wrapper class

	int i=Integer.parseInt(x);   //note -- integer is a wrapper class.
	System.out.println(i+20);
	
	//integer,char,double,boolean are Wrapper classes.
	
	//String to double conversion
	String y="12.33";
	double d=Double.parseDouble(y);
	System.out.println(d+10);
	
	//String to boolean conversion
	String k="true";
	boolean b=Boolean.parseBoolean(k);
	System.out.println(b);
	
	//int to String conversion
	int j=200;
	String p=String.valueOf(j); //"200"
	System.out.println(p);
	System.out.println(p+30);
	
	
	String u="100A";
	Integer.parseInt(u); //will give "NumberFormatException" ,as "100A" is not a pure integer
	
	
	
	
	
	
	
	
	}

}
