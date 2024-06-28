package recursion;

import java.util.Scanner;

public class PowerCalculation2 {
    public static int PowerCalculation(int a,int b){
        if(b==0){                             // Base Case
            return 1;
        }
        int number = PowerCalculation(a,b/2);      //Recursive Case
        if(b%2==0){
            return number * number;
        }
        return number * number * a;                 //Self Work
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int power = scanner.nextInt();
        System.out.println(PowerCalculation(value,power));
    }
}
