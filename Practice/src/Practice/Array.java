package Practice;

public class Array {

	public static void main(String[] args) {
		int sum=0;
		int a[]= {2,5,8,7,6,9};
		//finding sum of total number of elements of Array.
		
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);   //i=index
			//sum=sum+a[i];  //first a[i] will be 2, then 2+0=2.2 stored in sum.next a[i] is 5 and sum value is already 2 so 5+2=7 and so on
			
			//printing the index of desired number
			
			if(a[i]==6) {
				System.out.println(i);
				break;
			}
			
	}
    //  System.out.println(sum);
	
	
	
	}

}
