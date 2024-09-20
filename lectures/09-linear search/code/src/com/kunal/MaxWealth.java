package code.src.com.kunal;

// https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = new int[][]{
                {2, 3, 4},
                {5, 6},
                {1, 2, 6}
        };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int account : person) {
                sum += account;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
