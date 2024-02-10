package inputjava;
import java.util.Scanner;
public class sumoftwonumberbytakinginput
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number :");
        double x=sc.nextInt();
        System.out.println("enter second number :");
        double y=sc.nextInt();
        double z=x+y;
        System.out.println("Sum of the two numbers");
        System.out.println(z);
    }
}
