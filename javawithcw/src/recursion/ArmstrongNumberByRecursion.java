package recursion;

import java.util.Scanner;

public class ArmstrongNumberByRecursion {
    public static int armstrong(int val){
        if(val>=0 && val<=9){
            return (int) Math.pow(val,3);
        }
        return (int)Math.pow(val%10,3)+armstrong(val/10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if(value == armstrong(value)){
            System.out.println("Yes it's An Armstrong Number");
        }
        else{
            System.out.println("No It's Not An Armstrong Number");
        }
    }
}

