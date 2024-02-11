package loops;
import java.util.Scanner;

public class count_the_number_of_digit_in_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int count=0;
        while (n>0){
            count=count+1;
            n=n/10;
        }
        System.out.println(count);
    }
}
