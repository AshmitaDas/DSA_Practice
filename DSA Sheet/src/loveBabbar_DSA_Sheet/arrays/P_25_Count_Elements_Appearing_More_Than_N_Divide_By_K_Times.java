package loveBabbar_DSA_Sheet.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class P_25_Count_Elements_Appearing_More_Than_N_Divide_By_K_Times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
//        HashSet<Integer> ans = countElements(arr , n , k);
//        for (int i : ans) {
//            System.out.print(i + " ");
//        }
        countElements(arr , n , k);

    }
    public static void countElements(int[] arr , int n , int k) {
        int x = n / k;
//        int count = 0;
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0 ; i < n - 1; i++) {
//            count = 1 ;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] == arr[i])
//                    count++;
//            }
//            if (count > x)
//                set.add(arr[i]);
//        }
//        return set;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) > x) {
                System.out.println(arr[i]);
                map.put(arr[i], Integer.MIN_VALUE);
            }
        }
    }
}
