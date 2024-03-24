package recursion;

import java.util.Scanner;

public class PowerCalculation2 {
    public static int powercalculation(int value, int power) {
        if (power == 0) {
            return 1;
        }
        int smallpower = powercalculation(value,power/2);
        if (power%2==0){
            return smallpower*smallpower;
        }
        else{
            return value*smallpower*smallpower;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int power = scanner.nextInt();
        System.out.println(powercalculation(value,power));
    }
}
