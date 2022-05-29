package loveBabbar_DSA_Sheet.arrays;

import java.util.Scanner;

public class P_26_MaxProfit_By_Buying_And_Selling_Share_Atmost_Twice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProfit(arr , n));
    }
    public static int maxProfit(int[] arr , int n) {
        int[] profit = new int[n];
        for (int i = 0 ; i < n ; i++)
            profit[i] = 0;

        int maxPrice = arr[n- 1];
        for (int i = n - 2 ; i >= 0 ; i--) {
            if (arr[i] > maxPrice)
                maxPrice = arr[i];
            profit[i] = Math.max(profit[i + 1] , maxPrice - arr[i]);
        }

        int minPrice = arr[0];
        for (int i = 1 ; i < n ; i++) {
            if (arr[i] < minPrice)
                minPrice = arr[i];
            profit[i] = Math.max(profit[i - 1] , profit[i] + (arr[i] - minPrice) );
        }
        return profit[n - 1];
    }
}
