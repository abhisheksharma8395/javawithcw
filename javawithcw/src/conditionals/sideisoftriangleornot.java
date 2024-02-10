package conditionals;
import java.util.Scanner;
public class sideisoftriangleornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first side");
        a=sc.nextInt();
        System.out.println("Enter the second side");
        b=sc.nextInt();
        System.out.println("Enter the third side");
        c=sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("The given side are of triangle");
        }
        else{
            System.out.println("The given side are not of triangle");
        }
    }
}
