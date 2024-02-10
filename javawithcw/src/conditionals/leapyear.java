package conditionals;
import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int a=sc.nextInt();
        if (a%4==0){
            if(a%100!=0){
                System.out.println("The Entered year is a leap year");
            }
            if(a%100==0){
                if(a%400!=0){
                    System.out.println("The Entered year is not a leap year");
                }
                else{
                    System.out.println("The Entered year is a leap year");
                }
            }
        }
    }
}
