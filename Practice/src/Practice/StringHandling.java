package Practice;

public class StringHandling {

	public static void main(String[] args) {
//		String str="united we stand and divided we fall";
//		System.out.println(str.charAt(7));
//		System.out.println(str.length());
//		System.out.println(str.indexOf("v"));
//		System.out.println(str.substring(7));
//		System.out.println(str.toCharArray());
//		
//		
//		
//		String str1 = "there is an angel"; 
//		System.out.println(str1.compareTo(str));
//		System.out.println(str1.concat(" "+ str));
//		System.out.println(str.concat(" " + str1));
		
		//Reversing an string
		String s="saurabh";
		
		String t="";
		for(int i=s.length()-1;i>=0;i--) {
			t=t+s.charAt(i);
		}
		
  System.out.println(t);
	}

}
