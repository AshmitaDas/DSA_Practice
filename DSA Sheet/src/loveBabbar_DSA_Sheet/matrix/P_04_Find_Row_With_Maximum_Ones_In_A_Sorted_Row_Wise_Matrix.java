package loveBabbar_DSA_Sheet.matrix;

import java.util.Scanner;

public class P_04_Find_Row_With_Maximum_Ones_In_A_Sorted_Row_Wise_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(rowMaxOnes( arr,row , col));
    }

    public static int first(int[] mat , int low , int high) {
        // The function first() returns index of first 1 in row 0.
        int ans = high + 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mat[mid] == 1) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }
    public static int rowMaxOnes(int[][] mat , int row , int col) {
        int maxRow = 0;
        int j = first(mat[0] , 0 , col - 1) - 1;
        // index of first 0 in row 0 (The function first() returns index of first 1 in row 0) - 1.

        for (int i = 1 ; i < col ; i++) {
            while (j >= 0 && mat[i][j] == 1) {  // Move left until a 0 is found
                j = j - 1;  // Update the index of leftmost 1 seen so far
                maxRow = i;
            }
        }
        return maxRow;
    }
}
