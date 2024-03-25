package recursion;

import java.util.Scanner;

public class GCDCalculationByEuclidsAlgorithm {

    public static int eagcdr(int val1,int val2){
        if(val1%val2==0){
            return val2;
        }
        //Euclid Algorithm
        //
        return eagcdr(val2,val1%val2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        System.out.println(eagcdr(val1,val2));
    }
}
