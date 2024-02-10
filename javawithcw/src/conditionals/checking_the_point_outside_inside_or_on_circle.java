package conditionals;
import java.util.Scanner;
public class checking_the_point_outside_inside_or_on_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, x1, y, y1, radius, m1, m2;
        System.out.println("Enter X:");
        x = sc.nextDouble();
        System.out.println("Enter Y:");
        y = sc.nextDouble();
        System.out.println("Enter X1:");
        x1 = sc.nextDouble();
        System.out.println("Enter Y1:");
        y1 = sc.nextDouble();
        System.out.println("Enter Radius:");
        radius = sc.nextDouble();
        m1 = (((y1 - y) * (y1 - y)) + ((x - x1) * (x - x1)));
        m2 = Math.sqrt(m1);
        if (m2 == radius) {
            System.out.println("The point lies on Circle");
        } else {
            if (m2 < radius) {
                System.out.println("The point lies inside the Circle");
            } else {
                System.out.println("The point lies outside the Circle");
            }
        }
    }
}
