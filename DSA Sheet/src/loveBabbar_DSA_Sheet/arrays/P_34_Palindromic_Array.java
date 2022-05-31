package loveBabbar_DSA_Sheet.arrays;

import java.util.Scanner;

public class P_34_Palindromic_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(palinArray(arr , n));
    }

    public static int palinArray(int[] a, int n) {
        int ans = 0;
        for (int i = 0 , j = n - 1 ; i <= j ; ) {
            if (a[i] == a[j]) {
                i++;
                j--;
            }
            else if (a[i] > a[j]) {
                j--;
                a[j] += a[j + 1];
                ans++;
            }
            else {
                i++;
                a[i] += a[i - 1];
                ans++;
            }
        }
        return ans;
    }
}
