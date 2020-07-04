package javainterview.questions;

public class VowelAndConsonent {

	public static void main(String[] args) {
		
		//ch= a,e,i,o,u
		
		char ch='u';
		if(ch=='a' ||ch=='e'|| ch=='i' || ch=='o' ||ch=='u') {
			System.out.println("Alphabet is vowel:" + ch);
				
			}
		else {
			System.out.println("Alphabet is consonent");
			
		}

	//doing this program with "Switch case"
	
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Alphabet is vowel:" + ch);
			break;
			
			default:
				System.out.println("Alphabet is consonent");
		}
	
	}

}
