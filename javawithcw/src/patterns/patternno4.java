package patterns;
import java.util.Scanner;
public class patternno4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, p, s;
        System.out.println("enter the number");
        p = sc.nextInt();
        s = 65 + p;
        for (i = 65; i <= s; i++) {
            for (j = s; j >= i; j--) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}
