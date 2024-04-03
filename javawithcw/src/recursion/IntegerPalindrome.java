package recursion;
import java.util.Scanner;
public class IntegerPalindrome {
    private static int intpalindrome(int value, int d) {
        if (value >= 0 && value <= 9) {
            return value;
        }
        return (int) ((value % 10) * Math.pow(10, d - 1) + intpalindrome(value / 10, d - 1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int digit = scanner.nextInt();
        if (value == intpalindrome(value, digit)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }
        System.out.println(intpalindrome(value, digit));
    }
}
