package loveBabbar_DSA_Sheet.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P_28_Triplet_Sum_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(tripletSum(arr , n , k));
    }

    public static boolean tripletSum(int[] arr , int n , int x) {
        Arrays.sort(arr);
        for (int i = 0 ; i < n - 2 ; i++) {
            int j = i + 1;
            int k = n - 1;
            int sum = x - arr[i];
            while (j < k) {
                if (arr[j] + arr[k] == sum)
                    return true;
                if (arr[j] + arr[k] < sum)
                    j++;
                else
                    k--;
            }
        }
        return false;
    }
}
