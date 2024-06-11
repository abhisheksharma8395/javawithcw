package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CloningAnArray {
    public static void print(int[] array){
        for (int i : array){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[5];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        int[] Array2 = Array.clone();
        int[] Array3 = Arrays.copyOf(Array,Array.length);
        print(Array);
        print(Array2);
        print(Array3);
    }
}
