package numbersystem;

import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        int i,sum,power=1,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the decimal number");
        num=sc.nextInt();
        sum=0;
        while(num>0){
            sum=sum+(num%2)*power;
            num=num/2;
            power=power*10;
        }
        System.out.println(sum);
    }
}
