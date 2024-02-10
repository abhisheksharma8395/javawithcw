package inputjava;
import java.util.Scanner;
public class findtheremainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number :");
        int x1=sc.nextInt();
        System.out.println("enter the second number :");
        int x2=sc.nextInt();
        int remainder=(x1-(x1/x2)*x2);
        System.out.println(remainder);
    }
}
