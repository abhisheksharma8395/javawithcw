package recursion;

import java.util.Scanner;

public class GCDCalculationByLongestDivisionMethod {
    public static int ldgcdr(int val1,int val2){
        if(val1%val2==0){
            return val2;
        }
        return ldgcdr(val2,val1%val2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        System.out.println(ldgcdr(val1,val2));
    }
}
