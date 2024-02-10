package conditionals;
import java.util.Scanner;
public class divisibleby5ornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        if(a%5==0){
            System.out.println("The number is divisible by 5");
        }
        else {
            System.out.println("The number is not divisible by 5");
        }
    }
}
