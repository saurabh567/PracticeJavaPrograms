package javainterview.questions;

public class LeapYear {

	public static void main(String[] args) {
		//divisible by 4 for all the century years-- ending with 00
		//Century year is a leap year only when it is divisible by 400
		
		//1900 is not a leap year
		//2012 leap year
		                                           //Check it later
		
		int year=1900;
		boolean leap=false;
		
		if(year%4==0) {
			if(year%100==0) { //checking this is a century year or not(ending with 00)
			
				if(year%400==0) { //checking century year is a leap year or not
					leap =true;
				}
				else {
					leap=false;
				}
			leap=true;
			}
			else {
				leap=false;
			}
		if(leap) {
			System.out.println(year + "is a leap year");
		}
		else {
			System.out.println(year + "is not a leap year");
		}
		}
	}

}
