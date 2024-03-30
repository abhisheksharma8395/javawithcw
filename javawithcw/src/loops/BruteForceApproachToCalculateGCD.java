package loops;

import java.util.Scanner;

public class BruteForceApproachToCalculateGCD {
    public static int brutegcd(int val1,int val2){
        int minimum = Math.min(val1,val2);
        int max = 0;
        for (int i = 1; i <= minimum; i++) {
            if(val1%i==0 && val2%i==0){
                if(i>max){
                    max=i;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        System.out.println(brutegcd(val1,val2));
    }
}
