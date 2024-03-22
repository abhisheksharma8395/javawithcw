package recursion;

import java.util.Scanner;

public class FibonicciSeries {
    static int fibonicci(int val) {
        if (val == 0) {
            return val;
        } else if (val == 1) {
            return val;
        }
        return fibonicci(val - 1) + fibonicci(val - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonicci(i)+" ");
        }

    }
}
