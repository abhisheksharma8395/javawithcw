package javamethods;

import java.util.Scanner;

public class average_of_3_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println(avg(a,b,c));
    }
    public static int avg(int x,int y,int z){
        return  (x+y+z)/3;
    }
}

