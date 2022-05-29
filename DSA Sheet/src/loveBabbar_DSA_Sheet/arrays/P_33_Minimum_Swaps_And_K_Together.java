package loveBabbar_DSA_Sheet.arrays;

import java.util.Scanner;

public class P_33_Minimum_Swaps_And_K_Together {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(minSwap (arr, n, k));
    }
    public static int minSwap (int[] arr, int n, int k) {
        int count = 0;
        for(int i = 0 ; i < n ; i++) { //count total numbers less than equal to k
            if(arr[i] <= k)
                count++;
        }
        int bad = 0;
        for(int i = 0 ; i < count ; i++) { // count total bad numbers in the first window
            if(arr[i] > k)
                bad++;
        }

        int ans = bad;
        for(int i = 0 , j = count; j < n ; i++ , j++) { // j is included i is excluded

            if(arr[i] > k)
                bad--;

            if(arr[j] > k)
                bad++;

            ans = Math.min(ans , bad);
        }
        return ans;
    }
}
