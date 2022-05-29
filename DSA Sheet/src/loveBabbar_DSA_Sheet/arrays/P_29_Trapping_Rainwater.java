package loveBabbar_DSA_Sheet.arrays;

import java.util.Scanner;

public class P_29_Trapping_Rainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(rainwater(arr , n));
    }

    public static long rainwater(int[] arr , int n) {
        int left = 0 , right = n - 1 , maxL = 0 , maxR = 0;
        long sum = 0;

        while(left <= right) {
            if(arr[left] <= arr[right]) {
                if(arr[left] >= maxL)
                    maxL = arr[left];
                else
                    sum += maxL - arr[left];
                left++;
            }
            else {
                if(arr[right] >= maxR)
                    maxR = arr[right];
                else
                    sum += maxR - arr[right];
                right--;
            }
        }
        return sum;
    }
}