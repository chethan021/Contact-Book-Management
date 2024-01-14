import java.util.Arrays;

public class SpiralArray {
    public static void main(String[] args) {
        int[][] array = spiralArray(3);
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
           
          
        }
       
    }

    public static int[][] spiralArray(int n) {
        int[][] result = new int[n][n];
        int value = 1;
        int startRow = 0, endRow = n - 1, startCol = 0, endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Traverse right
            for (int i = startCol; i <= endCol; i++) {
                result[startRow][i] = value++;
            }
            startRow++;

            // Traverse down
            for (int i = startRow; i <= endRow; i++) {
                result[i][endCol] = value++;
            }
            endCol--;

            // Traverse left
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    result[endRow][i] = value++;
                }
                endRow--;
            }

            // Traverse up
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    result[i][startCol] = value++;
                }
                startCol++;
            }
        }

        return result;
    }
}
