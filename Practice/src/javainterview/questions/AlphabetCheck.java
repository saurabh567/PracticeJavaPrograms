package javainterview.questions;

public class AlphabetCheck {
//program to chech weather a character is alphabet or not
	public static void main(String[] args) {
		
		char c= 'Y';
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
			System.out.println("c is an alphabet:" +c);
		}
		else {
			System.out.println("c is not an alaphabet:" +c);
		}
	}

}
