package loops;
import java.util.Scanner;
public class print_1_to_n_using_for_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number up to which you want to print");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
