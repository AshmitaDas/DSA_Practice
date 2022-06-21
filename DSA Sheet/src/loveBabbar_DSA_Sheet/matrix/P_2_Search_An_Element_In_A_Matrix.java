package loveBabbar_DSA_Sheet.matrix;

import java.util.Scanner;

class Pair{
    int x; int y;

    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class P_2_Search_An_Element_In_A_Matrix {

    public static Pair search(int [][] matrix, int x) {
        Pair p = new Pair(-1 , -1);
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m * n;
        while (low < high) {
            int mid = (low + high) / 2;
            if (x == matrix[mid / n][mid % n]) {
                p.x = mid / n;
                p.y = mid % n;
                return p;
            }
            if (x < matrix[mid / n][mid % n])
                high = mid;
            else
                low = mid + 1;
        }
        return p;
    }
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
        int x = sc.nextInt();
        Pair p = search(arr , x);
        System.out.print(p.x + " " + p.y);
    }
}