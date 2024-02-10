package loops;

import java.util.Scanner;

public class printing_number_in_reverse_order_using_for_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number from which you want to start number");
        int n=sc.nextInt();
        for(int i=n;i>0;i-=1){
            System.out.println(i);
        }
    }
}
