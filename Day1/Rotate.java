package DSASheetChallenge.Day1;

import java.util.*;

//rotate 2D matrix by 90 deg.
public class Rotate {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        //Finding the transpose of the matrix
        for(int i=0; i<n;i++){
            for(int j=i; j<n; j++){
                if(i!=j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        //reversing the transpose array
        for(int i=0; i<n; i++){
            int low=0, high = n-1;
            while(low<=high){
                int temp = matrix[i][high];
                matrix[i][high] = matrix[i][low];
                matrix[i][low] = temp;
                high--;
                low++;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Rotate the matrix
        rotate(matrix);

        System.out.println("Rotated Matrix:");
        printMatrix(matrix);
    }
}
