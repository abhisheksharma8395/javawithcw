package inputjava;
import java.util.Scanner;
public class areaofsquare {
    public static void main(String[] args) {
        System.out.print("Enter the side of square :");
        Scanner sc=new Scanner(System.in);
        double side=sc.nextInt();
        double area=side*side;
        System.out.println(area);
    }
}
