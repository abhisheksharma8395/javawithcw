package recursion;
import java.util.Scanner;
public class CountOfDigitsByRecursion {
    public static int countofdigits(int val){
        int count = 0;
        if(val>=0 && val<=9){
            return 1;
        }

        return 1+countofdigits(val/10);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println(countofdigits(val));
    }
}
