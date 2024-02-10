package loops;
import java.util.Scanner;
public class print_sum_of_1_to_n_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number up to which you want to sum");
        int n=sc.nextInt();
        int i=1,sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("The sum from 1 to "+n+" is : "+sum);
    }
}
