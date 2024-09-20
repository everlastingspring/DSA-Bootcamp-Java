package code.src.com.kunal;

import java.util.Arrays;

public class ProductOfArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, -2};
//        int[] arr = new int[]{1, 3, 5, -2, 0};
//        int[] arr = new int[]{1, 3, 5, 0, -2, 0};
        //{-30,-10,-6,15}
        // by division method
        // first calculate product of all the values in the input
        // if value is not zero else calculate the zero count.
        // edge case may include possibilities of having zeros in the input.
        // for this will take zero count
        // if input has  no zero values.  then
        // result is division of product value by value for the result index
        // if input has multiple zero values . then
        // result is all zero
        // otherwise if only single value is zero in the input. then
        // for the input index which is zero . for that index the result is the product.
        // for the other indexes it is zero
        System.out.println(Arrays.toString(multiply(arr)));
    }

    static int[] multiply(int[] arr) {
        int[] ans = new int[arr.length];
        int product = 1;
        int zeroCount = 0;
        for (int value : arr) {
            if (value != 0) {
                product *= value;
            } else {
                zeroCount++;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            if (zeroCount > 1) {
                ans[i] = 0;
            } else if (zeroCount == 1) {
                ans[i] = arr[i] == 0 ? product : 0;
            } else {
                ans[i] = product / arr[i];
            }
        }
        return ans;
    }
}
