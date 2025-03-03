package Bit_Manipulation;

import java.util.Scanner;

public class minimumBitsFlipTOConvert {
    public static int minimumBitsFlip(int initial,int goal) {
        int result = 0;
        int bitStore = goal^initial;;
        while(bitStore != 0) {
            if(bitStore % 2 == 1) result++;
            bitStore /= 2;
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Initial Number : ");
        int initial = sc.nextInt();
        System.out.print("goal : ");
        int goal = sc.nextInt();
        System.out.println(minimumBitsFlip(initial,goal));
    }
}
