package basicMaths;

import java.util.Scanner;

public class LcmAndHcf {
    public static int gcd(int a, int b) {      // Brute Force Approach
        int min = Math.min(a, b);
        for (int i = min; i > 0; i--) {
            if(a%i == 0 && b%i == 0) {
                return i;
            }
        }
        return 0;
    }
    public static int gcd2(int a, int b) {      // Optimal Approach
        while (a>0 && b>0) {
            if(a>b){
                a=a%b;
            }
            else {
                b = b%a;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd1 = gcd(a,b);
        int gcd2 = gcd2(a,b);
        int lcm1 = a*b/gcd1;
        int lcm2 = a*b/gcd2;
        System.out.println("lcm is "+lcm1+"gcd is "+gcd1);
        System.out.println("lcm is "+lcm2+"gcd is "+gcd2);
    }
}
