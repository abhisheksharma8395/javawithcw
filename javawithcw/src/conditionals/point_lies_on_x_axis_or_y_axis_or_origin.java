package conditionals;
import java.util.Scanner;
public class point_lies_on_x_axis_or_y_axis_or_origin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Enter X:");
        x = sc.nextInt();
        System.out.println("Enter Y:");
        y = sc.nextInt();
        if (x == 0 && y==0) {
            System.out.println("The point lies Origin");
        }
        else if (y == 0 && x != 0) {
            System.out.println("The point lies on X-axis");
        }
        else if (x==0 && y!=0) {
            System.out.println("The point lies on Y-axis");
        }
        else{
            System.out.println("point not lies on X-axis,Y-axis and origin");
        }
    }
}
