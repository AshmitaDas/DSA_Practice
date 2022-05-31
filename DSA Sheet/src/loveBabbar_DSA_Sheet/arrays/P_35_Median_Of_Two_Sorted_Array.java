package loveBabbar_DSA_Sheet.arrays;

import java.util.Scanner;

public class P_35_Median_Of_Two_Sorted_Array{
    //Equal size array--- binary search can be applied on either array
    //Different size array--- binary search can be applied on the smaller array so that remaining elements are in excess in the larger size array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("MEDIAN = " + findMedianSortedArrays(a , b));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

// When length are different then apply binary search on shortest array to avoid index out of bound
        if(nums1.length > nums2.length){
            return(findMedianSortedArrays(nums2, nums1));
        }
        int n1 = nums1.length;
        int n2 = nums2.length;
        int low = 0, high = n1;
        while(low <= high)
        {
//         Initialize the cuts or partitions
            int cut1 = ( high + low ) / 2;  // mid value
//         Total required - already present
            int cut2 = ( ( n1 + n2 ) / 2 ) - cut1;

//         Initialize l1,l2,r1,r2
            int l1 = ( cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1-1];
            int l2 = ( cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2-1];
            int r1 = ( cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];
            int r2 = ( cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];

//         Shift element to the left
            if( l1 > r2 ) high = cut1 - 1;
            else if( l2 > r1 ) low = cut1 + 1;
            else
            {
//             Check for even length
                if(( n1 + n2 ) % 2 ==0)
                    return (double)(Math.max( l1 , l2 ) + Math.min (r1  ,r2 )) / 2;
                else
                    return (double)(Math.min( r1 , r2 ));
            }
        }
        return 0.0;
    }
}
