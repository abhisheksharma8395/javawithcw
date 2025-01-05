package basicMaths;

import java.util.Scanner;

public class findSumOfAllDivisors {
    public static int FindSumOfAllDivisors(int n) {
        int sum = 0;
        int a = (int)Math.sqrt(n);
        for (int i = 1; i <= a; i++) {
            if (n % i == 0) {
                sum += i;
                if(n/i!=i){
                    sum += n/i;
                }
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(FindSumOfAllDivisors(num));
    }
}
