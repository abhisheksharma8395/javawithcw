package loops;
import java.util.Scanner;
public class find_a_raise_to_power_b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int a=sc.nextInt();
        System.out.println("enter the power");
        int b=sc.nextInt();
        int ans=1;
        int i=1;
        while(i<=b){
            ans=ans*a;
            i++;
        }
        System.out.println(ans);
    }
}

