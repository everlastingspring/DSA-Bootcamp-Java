package code.src.com.kunal;

import java.util.*;

public class AddToArrayForm {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        for (Integer i : addToArrayForm(arr, 1)) {
            System.out.print(i + " ");
        }
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        // Add k to the single digit num
        int carry = k;
        for (int i = num.length - 1; i >= 0 || carry > 0; i--) {
            if (i >= 0) {
                carry += num[i];
            }
            result.add(0, carry % 10);
            carry /= 10;
        }
        return result;
    }
}
