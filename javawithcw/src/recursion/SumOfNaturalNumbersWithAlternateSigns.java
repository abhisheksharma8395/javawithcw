package recursion;

import java.util.Scanner;

public class SumOfNaturalNumbersWithAlternateSigns {
    public static int sumwithalternatesigns(int val){   //10
        if(val==1){
            return 1;
        }
        int subproblem=sumwithalternatesigns(val-1); //1-2+3-4+5-6+7-8+9-10
        if(val%2==0){
            return subproblem-val;
        }
        else{
            return subproblem+val;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        System.out.println(sumwithalternatesigns(val));  //10
    }
}
