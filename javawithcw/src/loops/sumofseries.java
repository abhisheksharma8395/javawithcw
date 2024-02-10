package loops;
import java.util.Scanner;
public class sumofseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int ans=0;
        for (int i=1;i<=n;i++){
            if(i%2==0){
                ans=ans-i;
            }
            else{
                ans=ans+i;
            }
        }
        System.out.println(ans);
    }
}
