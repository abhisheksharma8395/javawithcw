package recursion;

import java.util.Scanner;

public class AllPossibleTossOutcomes {
    public static void TossOutcome(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        TossOutcome(n-1,ans+"H");
        TossOutcome(n-1,ans+"T");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TossOutcome(n,"");
    }
}
