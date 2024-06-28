package recursion;

import java.util.Scanner;

public class GCDCalculationByEuclidsAlgorithm {
    public static int gcd(int val1,int val2,int helper){    //Brute Force Approach
        if(helper==1){
            return 1;
        }
        if(val1%helper==0 && val2%helper==0){
            return helper;
        }
        return gcd(val1,val2,helper-1);
    }

    public static int OptimisedGCD(int val1, int val2) {  // Optimised Approach
        if(val1==0){
            return val2;
        }
        return OptimisedGCD(val2%val1,val1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int helper = Math.min(val1,val2);
        System.out.println(OptimisedGCD(val1,val2));
        System.out.println(gcd(val1,val2,helper));
    }
}
