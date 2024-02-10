package loops;

import java.util.Scanner;

public class print_the_given_number_in_reverse_order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int ans=0;
        while (n>0){
            ans=(ans*10)+(n%10);
            n=n/10;
        }
        System.out.println(ans);
    }
}
