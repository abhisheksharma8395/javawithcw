package sorting;

import java.util.Scanner;

public class RadixSort {
    public static void RadixSortAlgo(int[] array){
        int max = maxElement(array);
        for (int place = 1; max/place > 0; place*=10) {
            countSort(array,place);
        }
    }
    public static int maxElement(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
    public static void countSort(int[] array,int place) {               //This method makes Count Sort Unstable.
        int[] frequency = new int[10];
        for (int i : array) {
            frequency[(i/place)%10]++;
        }
        for (int i = 1; i < frequency.length; i++) {
            frequency[i] = frequency[i] + frequency[i-1];
        }
        int[] ans = new int[array.length];
        for (int i = array.length-1; i >=0; i--) {
            ans[frequency[(array[i]/place)%10]-1]= array[i];
            frequency[(array[i]/place)%10]--;
        }
        for (int i = 0; i < array.length; i++) {
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
        RadixSortAlgo(array);
        Display(array);
    }
}
