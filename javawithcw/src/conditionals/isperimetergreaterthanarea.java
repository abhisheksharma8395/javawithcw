package conditionals;
import java.util.Scanner;
public class isperimetergreaterthanarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length=sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth=sc.nextInt();
        int area=length*breadth;
        int perimeter=2*(length+breadth);
        if(area<perimeter){
            System.out.println("Perimeter is greater than area");
        }
        else if(perimeter<area) {
            System.out.println("Area is greater than perimeter");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
