package loveBabbar_DSA_Sheet.arrays;

import java.util.Scanner;

public class P_32_Three_Way_Partitioning_OR_Sort_One_Two_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();

        threeWayPartioning(array , a , b);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void threeWayPartioning(int[] array , int a , int b) {
        int i = 0 , j = 0 , k = array.length - 1 , temp;
        while(j <= k) {
            if(array[j] < a) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j++;
            }
            else if(array[j] >= a && array[j] <= b) {
                j++;
            }
            else {
                temp = array[j];
                array[j] = array[k];
                array[k] = temp;
                k--;
            }
        }
    }
}