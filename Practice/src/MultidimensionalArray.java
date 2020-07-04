
public class MultidimensionalArray {

	public static void main(String[] args) {
		int a[][]= new int [2] [3];  //MultidimensionalArray
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=7;
				
		for(int i=0;i<2;i++) {  //it will iterate only for 2 times, that is for i=0 and i=1 
			for(int j=0;j<3;j++) { //inner loop for coulmn,it will iterate only for 3 times, that is for j=0, j=1 and j=2
				System.out.println(a[i][j]);
			}
		}
	
		
//		int b[][]= {{2,4,5}, {3,4,7}, {5,2,1}};
//		System.out.println(b[2][1]);

	}

}
