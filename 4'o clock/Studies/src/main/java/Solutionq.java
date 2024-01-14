import java.util.Arrays;

class Solutionq {
    public static void setZeroes(int[][] matrix) {
    	int [][] ans=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for( int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1)
                {
                   ans[i][j]=0;
                }
            }
        }
        for(int[]i:ans) {
			System.out.println(Arrays.toString(i));
		}
	}
    
    public static void main(String[] args) {
    	int[][] matrix= {{0,1,1},{1,1,1},{1,1,1}};
		setZeroes(matrix);
		
}
    }