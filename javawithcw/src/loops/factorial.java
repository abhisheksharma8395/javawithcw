package loops;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int ans=1;
        int i=1;
        while(i<=n){
            ans=ans*i;
            i++;
        }
        System.out.println(ans);
    }
}
