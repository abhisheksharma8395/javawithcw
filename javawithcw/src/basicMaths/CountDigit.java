package basicMaths;
import java.util.Scanner;
public class CountDigit {
    public static int digitCounter(int n){  //Brute Force
        int count = 0;
        while(n > 0){
            count++;
            n = n / 10;
        }
        return count;
    }
    public static int digitCounter2(int n){       //Optimal Approach
        int count = (int)Math.log10(n);
        return count+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digitCounter(n));
        System.out.println(digitCounter2(n));
    }
}
