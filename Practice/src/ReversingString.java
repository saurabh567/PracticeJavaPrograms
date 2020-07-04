import java.util.Scanner;

public class ReversingString {

	public static void main(String[] args) {
		
//		String s="";
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a string to reverse");
//		s=sc.nextLine();
//		
//		int len=s.length();
//		String rev="";
//		for(int i=len-1;i>=0;i--) {
//			rev=rev +s.charAt(i);
//		}
//		
//	System.out.println(rev);
	
	
	//Reversing a String through StringBuffer class
		String s="Selenium";
		StringBuffer sf=new StringBuffer(s);
		System.out.println(sf.reverse());
//	sf.append("Automation").append("Testing").reverse().insert(2, "xyz").delete(3, 7); //This is called Method Chaining
//	System.out.println(sf);	
		
	
//	String str="saket saurabh";
//	char ch[]=str.toCharArray();
//	for(int i=ch.length-1;i>=0;i--) {
//		System.out.print(ch[i]);
//	}
	
	
	
	}

}
