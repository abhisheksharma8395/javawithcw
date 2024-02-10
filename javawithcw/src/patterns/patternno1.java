package patterns;
import java.util.Scanner;
public class patternno1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,p;
        System.out.println("enter the number");
        p=sc.nextInt();
        for(i=1;i<=p;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
