package Practice;

import java.text.SimpleDateFormat;
import java.util.Date; //import java.util is a package and Date is a class. Sytax--package.class

public class Datedemo {

	public static void main(String[] args) {
		
		
		Date d=new Date();
		System.out.println(d.toString()); //Printing date,time month
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd= new SimpleDateFormat("M/d/yyyy  hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		
		//we need date like in this format---- mm//dd//yyyy HH:MM:SS
		//SimpleDateFormat--It is a class in java
		

	}

}
