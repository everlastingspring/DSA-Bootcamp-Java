package code.src.com.kunal;

public class CountNums {
    public static void main(String[] args) {
        int n = 45535;

        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10; // n /= 10
        }

        System.out.println(count);
    }
}
