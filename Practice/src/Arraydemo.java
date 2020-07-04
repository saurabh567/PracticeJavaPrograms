
public class Arraydemo {

	public static void main(String[] args) {
//		int a[]=new int[5]; //Deaclare an Array and allocates memory for the variable
//		a[0]=2;
//		a[1]=4;
//		a[2]=6;
//		a[3]=8; //initialzed value into the Array.
//		a[4]=10;
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]); //retrives values present in this Array
		
		
		int sum=0;
		int b[]= {1,4,7,11,15,26,41,57,93};   //Single dimensional Array
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		sum=sum+b[j];
		}
		System.out.println(sum);
		
		
		}
		
		
		
		

	}


