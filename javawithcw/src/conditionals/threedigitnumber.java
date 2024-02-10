package conditionals;
import java.util.Scanner;
public class threedigitnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        if (a>99 && a<1000){
            System.out.println("The number is three digit number");
        }
        else{
            System.out.println("it is not a three digit number");
        }
    }
}
