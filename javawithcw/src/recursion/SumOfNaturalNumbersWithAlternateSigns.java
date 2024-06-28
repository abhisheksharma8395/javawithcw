package recursion;

import java.util.Scanner;

public class SumOfNaturalNumbersWithAlternateSigns {
    public static int SumWithAlternateSigns(int val) {   //10
        if (val == 1) {                 // Base Case
            return 1;
        }
        if (val % 2 == 0) {             // Self Work And Recursive Case
            return SumWithAlternateSigns(val - 1) - val;
        }
        return SumWithAlternateSigns(val - 1) + val;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        System.out.println(SumWithAlternateSigns(val));  //10
    }
}
