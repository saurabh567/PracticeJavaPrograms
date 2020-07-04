package collection.concept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		//HashTable is similar to HashMap.
		//HashTable is synchronized.synronized means thread safe(thread safe means one by one process will be done)
		//HashTable also stores the value on the basis of "key" and "value" pair
		// key-->Object-->HashCode-->value
		/*in Hashtable ,key is stored in the form of object,and each and every object inside the java
		is having a special unique identifier called,HashCode(it is java object nmber).and for
		that hashcode one "Value" will be associated */

	//Hashcode number is given by JVM and it is a 32 bit integer number
	
	
	Hashtable h1=new Hashtable();
	h1.put(1, "Tom");
	h1.put(2, "Test");
	h1.put(3, "java");
	
	//Crate a Clone copy/Shallow copy
	Hashtable h2=new Hashtable();
	h2=(Hashtable) h1.clone();
	
	System.out.println("the values from h1 object:" + h1);
	System.out.println("the values from h2 object:" + h2);
	
	h1.clear();
	System.out.println("the values from h1 object:" + h1);
	System.out.println("the values from h2 object:" + h2);
	
	
	Hashtable st=new Hashtable();
	st.put("A","Naveen");
	st.put("B","Manager");
	st.put("C","Selenim");
	
	if(st.containsValue("Naveen"))
			{
		System.out.println("value is  found");
	}
//Enumeration and Entryset are used in Hashtable---Hashtable, it does not store the value in ordering(0,1,2,3) ,so don't use for loop	
//Print all the values from Hashtable---using Enumeration
	Enumeration e=st.elements();
	System.out.println("print values from st using enumeration");
	
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
}
	
	//get all the values from hashtable using---Entryset()--set of hashtable values
	
	System.out.println("print values from st using entry set");
	    Set s=st.entrySet();
	    System.out.println(s);
	    
	  System.out.println("-------------------------------------------------------------");
	
	  Hashtable st1=new Hashtable();
		st1.put("A","Naveen");
		st1.put("B","Manager");
		st1.put("C","Selenim");
		st1.put("C","Selenim"); //it contains only unique values
		//st1.put(null,"Selenium");    //null keys and null values are not allowed //will give Nullpointer exception
		
		
		System.out.println("values from st1:" +st1); 
		
	
		//Check both the Hashtables are equal or not
		
		if(st.equals(st1)) {
			System.out.println("both are equal");
		}
	
	//get the value from a Key
		System.out.println(st1.get("A"));
		
		
		//get the hashcode of hashtable object
		
		System.out.println("the hashcode value of st1"+ st1.hashCode());
	
	
	
	
	}

}
