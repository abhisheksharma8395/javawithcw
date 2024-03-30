package loops;

import java.util.Scanner;

public class LongDivisionMethodForGCDCalculation {
    public static int ldgcd(int val1,int val2){
        while(val1%val2!=0){
            int remainder = val1%val2;
            val1 = val2;
            val2 = remainder;
        }
        return val2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        System.out.println(ldgcd(val1,val2));
    }
}
