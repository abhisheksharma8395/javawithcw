package conditionals;
import java.util.Scanner;
public class printabsolutevalueofinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        if(a<0){
            System.out.println(-a);
        }
        else {
            System.out.println(a);
        }
    }
}
