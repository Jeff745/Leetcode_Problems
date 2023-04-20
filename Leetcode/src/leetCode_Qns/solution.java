package leetCode_Qns;

public class solution {
	
public static boolean searchMatrix(int[][] matrix, int target) {
	
	int temp = 0;
	
	for( int i=0; i<=matrix.length;i++)
		{
			temp= matrix[i++][matrix.length-1];
			
			
		}
	
	return true;
	
	
    }

public static void main(String[] args) {
	int[][] test={{ 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 }};
	int target= 13;
	searchMatrix(test,target);
	
}

}
