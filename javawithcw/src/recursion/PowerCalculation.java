package recursion;
import java.util.Scanner;
public class PowerCalculation {
    public static int powercalculation(int val,int pow){
        if(pow == 0){
            return 1;
        }
        return val*powercalculation(val,pow-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        int pow = scanner.nextInt();
        System.out.println(powercalculation(val,pow));
    }
}
