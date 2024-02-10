package inputjava;
import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the radius");
        int radius = sc.nextInt();
        double pi=3.14;
        double area=pi*radius*radius;
        double perimeter=2*pi*radius;
        System.out.println(area);
        System.out.println(perimeter);
    }
}
