package arrays.questions;

import java.util.Scanner;

public class TripletsSum {
    public static int tripletcount(int[] array, int target) {
        int n = array.length;
        int totalTriplet = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] == target) {
                        totalTriplet += 1;
                    }
                }
            }
        }
        return totalTriplet;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[5];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println("Total triplet in Array By iterative method O(n^3) :" +tripletcount(Array,target));
    }
}
