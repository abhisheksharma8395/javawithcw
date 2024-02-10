package loops;
import java.util.Scanner;
public class sum_a_number_while_user_could_not_press_minus1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number or -1 to exit");
        int num=sc.nextInt();
        int sum=0;
        while(num!=-1){
            sum=sum+num;
            System.out.println("Enter a number or -1 to exit");
            num=sc.nextInt();
        }
        System.out.println(sum);
    }
}
