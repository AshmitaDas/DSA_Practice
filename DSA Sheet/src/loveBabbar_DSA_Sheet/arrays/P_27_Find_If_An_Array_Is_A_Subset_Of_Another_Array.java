package loveBabbar_DSA_Sheet.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class P_27_Find_If_An_Array_Is_A_Subset_Of_Another_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        System.out.println(subsetOrNot(a1, n1 , a2 , n2));
    }
    public static String subsetOrNot(int[] a1 , int n1 , int[] a2 , int n2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            map.put(a1[i], map.getOrDefault(a1[i], 0) + 1);
        }
        for (int i = 0; i < n2; i++) {
            if (!map.containsKey(a2[i]))
                return "No";
        }
        return "Yes";
    }
}
