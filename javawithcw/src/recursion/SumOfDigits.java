package recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static int SumOfDigit(int n){
        if(n<=0){
            return 0;
        }
        return n%10 + SumOfDigit(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SumOfDigit(n));
    }

}
