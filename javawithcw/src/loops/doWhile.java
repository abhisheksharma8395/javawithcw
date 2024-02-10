package loops;
import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number up to which you want to print the number");
        int n = sc.nextInt();
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
