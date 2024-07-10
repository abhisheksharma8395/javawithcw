package sorting;

import java.util.Scanner;

public class ArrayContaining0and1and2Only {
    public static void SortArrayWith012(int[] array){
        int n = array.length;
        int[] frequency = new int[3];
        for (int i : array){
            frequency[i]++;
        }
        for (int i = 1; i < frequency.length; i++) {
            frequency[i] = frequency[i]+frequency[i-1];
        }
        int[] ans = new int[n];
        for (int i = array.length-1; i >= 0; i--) {
            ans[frequency[array[i]]-1] = array[i];
            frequency[array[i]]--;
        }
        for (int i = 0; i < ans.length; i++) {
            array[i] = ans[i];
        }
    }
    public static void Display(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        SortArrayWith012(array);
        Display(array);
    }
}
