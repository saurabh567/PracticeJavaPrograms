
public class InterviewArray {

	public static void main(String[] args) {
		/* 2 4 5
		 * 3 4 7
		 * 1 2 9
		 */
//Print minimum number from the above matrix
		
		int abc[][]= {{2,4,5},{3,4,7},{1,2,9}};
		
		int min=abc[0][0];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				if(abc[i][j]<min){  //2---considering the 2 which is at place 0 th row and  0th colmn place,as smallest
				
					min=abc[i][j];
				}
			}
		}
	
	System.out.println(min);
	
	}
//Assignment--Find out the maximum number in the array
}
