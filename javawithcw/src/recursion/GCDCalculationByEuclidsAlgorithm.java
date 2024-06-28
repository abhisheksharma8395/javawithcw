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

    public static int eagcdr(int val1,int val2){  // Optimised Approach
        if(val1%val2==0){
            return val2;
        }
        //Euclid Algorithm
        //gcd(val1,val2)=gcd(val2,val1%val2)
        return eagcdr(val2,val1%val2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int helper = Math.min(val1,val2);
        System.out.println(eagcdr(val1,val2));
        System.out.println(gcd(val1,val2,helper));
    }
}
