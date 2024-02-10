package numbersystem;

import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        int sum,power=1,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the binary number");
        num=sc.nextInt();
        sum=0;
        while(num>0){
            sum=sum+(num%10)*power;
            num=num/10;
            power=power*2;
        }
        System.out.println(sum);
    }
}
