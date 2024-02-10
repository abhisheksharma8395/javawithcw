package conditionals;
import java.util.Scanner;
public class thenumberisdivisibleby3and5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        if (a%3==0 && a%5==0){
            System.out.println("The number is divisible by 3 and 5");
        }
        else if(a%3==0 && a%5!=0){
            System.out.println("The number is divisible by 3 but not 5");
        }
        else if(a%3!=0 && a%5==0){
            System.out.println("The number is divisible by 5 but not 3");
        }
        else{
            System.out.println("The number is not divisible by both 3 and 5");
        }
    }
}
