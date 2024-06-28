package recursion;
import java.util.Scanner;
public class PowerCalculation {
    public static int PowerCalculaton(int num,int pow){
        if(pow==0){                                //Base Case
            return 1;
        }
        return num * PowerCalculaton(num,pow-1);  //Self Work + Recursive Condition
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        int pow = scanner.nextInt();
        System.out.println(PowerCalculaton(val,pow));
    }
}
