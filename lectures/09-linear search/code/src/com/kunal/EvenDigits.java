package code.src.com.kunal;

import java.time.Duration;
import java.time.Instant;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));

        Instant start = Instant.now();
        System.out.println(countDigits(34567));
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: " + timeElapsed.toMillis() + " in milliseconds");
        System.out.println("Time taken: " + timeElapsed.toSeconds() + " in seconds");
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = countDigits(num);
        return numberOfDigits % 2 == 0;
    }

    // requires O(1) time complexity & O(1) space complexity
    static int countDigitsByLog(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }

    // count number of digits in a number
    // requires O(n) time complexity & O(1) space complexity
    static int countDigits(int num) {

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }
        return count;
    }
}
