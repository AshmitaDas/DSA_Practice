package loveBabbar_DSA_Sheet.arrays;

import java.util.Scanner;

public class P_31_Smallest_Subarray_With_Sum_More_Than_A_Given_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(smallestSubWithSum( arr , n , x));
    }
    public static int smallestSubWithSum(int []a, int n, int x) {
        int currSum = 0 , minLen = n + 1 , start = 0 , end = 0;
        while(end < n) {
            while(currSum <= x && end < n) {
                currSum += a[end];
                end++;
            }

            while(currSum > x && start < n) {
                if(end - start < minLen)
                    minLen = end - start;

                currSum -= a[start];
                start++;
            }
        }
        return minLen;
    }
}

