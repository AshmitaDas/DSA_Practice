package loveBabbar_DSA_Sheet.arrays;

import java.util.*;

public class P_30_Chocolate_Distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a.add(x);
        }
        System.out.println(findMinDiff(a , n , m));
    }

    public static long findMinDiff(ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        long diff = Long.MAX_VALUE;
        for(int i = 0 ; i + m - 1 < n ; i++) {
            diff = Math.min(diff , a.get(i + m - 1) - a.get(i));
        }
        return diff;
    }
}
