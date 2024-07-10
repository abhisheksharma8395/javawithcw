package sorting;

import java.util.Scanner;

public class TwoSwappedElements {
    public static void twoswappedelements(int[] array) {
        int x = -1, y = -1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }
        swap(array,x,y);
    }

    public static void swap(int[] array, int firstIndex, int SecondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[SecondIndex];
        array[SecondIndex] = temp;
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
        twoswappedelements(array);
        Display(array);
    }
}
