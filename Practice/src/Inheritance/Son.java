package Inheritance;

public class Son extends Grandfather {

	public static void main(String[] args) {
		
		
		Son s = new Son();
		s.city();
		s.district();
		s.country();
		System.out.println(s.a);
		
	}
		public void activities() {
			System.out.println("likes playing badminton");
		}

	}


