package Practice;

import java.util.Scanner;

public class Miscellaneous {

	public static void main(String[] args) {
//		int a=60;
//		int b=50;
//		int c=40;
//		
//		if(a>b & a>c) {
//			System.out.println("a is greatest");
//		}
//		else if(b>c) {
//			System.out.println("b is greatest");
//		}
//	  else {
//		System.out.println("c is greatest");
//		
//	}
//
//         int x,y,z;
//         
//         Scanner sc= new Scanner(System.in);
//     System.out.println("Enter the first number");
//    	 x=sc.nextInt();
//    	 
//    	 System.out.println("Enter the second number");
//    	 y=sc.nextInt();
//    	 
//    	 System.out.println("Enter the third number");
//    	 z=sc.nextInt();
//    	 
//    	 if(x>y & x>z) {
//    		 System.out.println("x is the greatest number:" +x);
//    	 }
//    		 
//    		 else if(y>z) {
//    			 System.out.println("y is the greatest number:" +y);
//    		 }
//    		 
//    		 else {
//    			 System.out.println("z is the greatest number:" +z);
//    		 }
//    	 
    	 
    int i=1;
    int j=i++; //firstly the value of i,will be given to j(that is 1),and then increase the value of i by 1
    
   System.out.println(i);
   System.out.println(j);
    
     
	int a=1;
	int b=++a; //pre increment
	System.out.println(a);
	System.out.println(b);
	
	
	int m=2;
	int n=m--; //post decrement
	System.out.println(m);
	System.out.println(n);
			
	int p=2;
	int q=--p;
	System.out.println(p);
	System.out.println(q);
	
System.out.println("**********************************************************");	
//	int r=5;
//	System.out.println(r);
//	System.out.println(r++);
//	System.out.println(r--);
//	System.out.println(++r);
//	System.out.println(--r);
	
	int d=7;
	System.out.println(++d+d++-d++);
	System.out.println("**********************************************************");	
	
	//print the number from 1 to 10 using while loop
	//disadavantage of while loop---while loop will give us infinite loop if increment/decrement operator is not provide
	
	i=1;  //initialization
	while(i<=10) {    //conditional
		System.out.println(i);
		i++; //increment operator 
	}
	System.out.println("**********************************************************");			
	//print the number from 1 to 10 using for loop	
	
	for(int s=1;s<=10;s++) {
		System.out.println(s);
	}
	
	int e=300;
	int f=200;
	//Note-- + is coccatenation operator
	String g ="Hello";
	String h = "World";
	
	double k=12.33;
	double l=10.33;
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	
	System.out.println(e+f); //500
	System.out.println(g+h); //HelloWorld
	System.out.println(e+f+g+h);//500HelloWorld
	System.out.println(g+h+e+f);//HelloWorld300200
	System.out.println(g+h+(e+f)); //HelloWorld500
	System.out.println(e+f+g+h+e+g+f+h);//500HelloWorld300Hello200World
	System.out.println(e+f+g+h+e+f);//500HelloWorld300200
	System.out.println(k+l);//22.66
	System.out.println(g+h+k+l);//HelloWorld12.3310.33
	System.out.println(e);//300
System.out.println("********************************************************************");	
	
	//Array Concepts
	//Array-Array is a collection of similar datatyypes
	//lowest bound/index=0
	//highest bound/index= (n-1), where n is the size of Array(here n=4)
	//Disdavantages of Array
//1. Size is fixed--that is why called as Static Array,to overcome this problem we use Collections
//     like--Arraylist,Hashtable--means use of dynamic array

//2. Stores only similar datatypes--to overcome this problem we use Object Array

//Note--Object is a Superclass of all the Classes.






	int t[]=new int[4];
	t[0]=10;
	t[1]=20;
	t[2]=30;
	t[3]=40;
	System.out.println(t[1]);
	System.out.println(t[3]);
	//System.out.println(t[4]); //Will give "ArrayIndexOutofBoundsException"
	System.out.println(t.length);
	
//System.out.println("printing  all the values of array");	
//for(int y=0;y<=t.length;y++) {
//	System.out.println(t[y]);
//}

System.out.println("printing  all values of array using foreach loop");	
for(int element:t)	{
	System.out.println(element);
}
	
	//double array
     
 double u[]=new double[3];
 u[0]=12.33;
 u[1]=13.44;
 u[2]=45.55;
 
 System.out.println(u[1]);
 
 
 //char array
 char ch[]=new char[3];
 ch[0]='a';
 ch[1]='#';
 ch[2]='&';
 System.out.println(ch[1]);
 
 //String array
 String str[]=new String[3];
 str[0]="Hello";
 str[1]="world";
 str[2]="saurabh";
 System.out.println(str[1]);
 System.out.println(str.length);
 
		 
//boolean array
 boolean w[]=new boolean[2];
 w[0]=true;
 w[1]=false;
 
     
	//Creating Object Array
 
// Note=Object is a class, which is used to store different data type values.
 
 Object obj[]=new Object[6];
 obj[0]="Tom";
 obj[1]=25;
 obj[2]=12.33;
 obj[3]="1/1/1990";
 obj[4]='M';
 obj[5]="London";
 
 System.out.println(obj[5]);
 System.out.println(obj.length);//length methood will you you the size of the array
	
	for(int z=0;z<obj.length;z++) {
		System.out.println(obj[z]);
	}
		
	}

	
	
	
	
	
	
	}