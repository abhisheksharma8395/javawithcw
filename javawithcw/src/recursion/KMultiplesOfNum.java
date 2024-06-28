package recursion;

import java.util.Scanner;

public class KMultiplesOfNum {
    public static void KMultipleOfNum(int val,int NoOfMultiples){  //5 4
        if(NoOfMultiples==1){                 // Base Case
            System.out.println(val);
            return;
        }
        KMultipleOfNum(val,NoOfMultiples-1);  // 5 10 15 Recursive Case
        System.out.println(val*NoOfMultiples);            // 20 Self Work
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        int NoOfMultiples = scanner.nextInt();
        KMultipleOfNum(val,NoOfMultiples);
    }
}
