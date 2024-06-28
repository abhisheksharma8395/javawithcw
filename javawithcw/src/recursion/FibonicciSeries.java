package recursion;

import java.util.Scanner;

public class FibonicciSeries {
    public static int fibonicci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonicci(n-1)+fibonicci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonicci(i)+" ");
        }

    }
}
