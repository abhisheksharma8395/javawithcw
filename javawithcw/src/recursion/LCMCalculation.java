package recursion;

import java.util.Scanner;

public class LCMCalculation {
    public static void main(String[] args) {
        GCDCalculationByEuclidsAlgorithm gcdCalculationByEuclidsAlgorithm = new GCDCalculationByEuclidsAlgorithm();
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        //LCM * HCF = VAL1 * VAL2
        int lcm = (val1*val2)/gcdCalculationByEuclidsAlgorithm.eagcdr(val1,val2);
        System.out.println(lcm);
    }
}
