package loveBabbar_DSA_Sheet.matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class P_1_Spiral_Traversal_On_A_Matrix {
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
        ArrayList<Integer> ans = spirallyTraverse(arr , row , col);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    static ArrayList<Integer> spirallyTraverse(int arr[][], int r, int c) {
        ArrayList<Integer>al=new ArrayList<>();
        int top=0,right=c-1,bottom=r-1,left=0;
        while(top<=bottom&&left<=right)
        {
            for(int i=left;i<=right;i++)
                al.add(arr[top][i]);
            top++;
            for(int i=top;i<=bottom;i++)
                al.add(arr[i][right]);
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                    al.add(arr[bottom][i]);
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                    al.add(arr[i][left]);
                left++;
            }
        }
        return al;
    }
}

