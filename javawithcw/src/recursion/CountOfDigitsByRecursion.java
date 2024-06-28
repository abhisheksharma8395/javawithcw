package recursion;
import java.util.Scanner;
public class CountOfDigitsByRecursion {
    public static int CountOfDigits(int n){
        if(n==0){
            return 0;
        }
        return 1+CountOfDigits(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println(CountOfDigits(val));
    }
}
