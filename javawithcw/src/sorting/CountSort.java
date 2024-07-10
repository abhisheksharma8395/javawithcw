package sorting;
import java.util.Scanner;
public class CountSort {
    public static int maxElement(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
    public static void countSort(int[] array) {               //This method makes Count Sort Unstable.
        int max = maxElement(array);
        int[] frequency = new int[max + 1];
        for (int i : array) {
            frequency[i]++;
        }
        int i = 0;
        int j = 0;
        while (i < array.length && j < array.length) {
            if (frequency[i] != 0) {
                array[j] = i;
                frequency[i]--;
                j++;
            } else {
                i++;
            }
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
        countSort(array);
        Display(array);
    }
}
