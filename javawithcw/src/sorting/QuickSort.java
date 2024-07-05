package sorting;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    public static void QuickSortR(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int PivotIndex = Partition(array, start, end);
        QuickSortR(array, start, PivotIndex - 1);
        QuickSortR(array, PivotIndex + 1, end);
    }

    public static int Partition(int[] array, int start, int end) {
        Random random = new Random();
        int ChooseIndex = random.nextInt(start,end+1); // Generate random index for pivot to optimise the code bet
        int Pivot = array[ChooseIndex];
        int Count = 0;              // Counts the element lesser than pivot element
        for (int i = start; i <= end; i++) {
            if (array[i] < Pivot) {
                Count++;
            }
        }
        int PivotIndex = start + Count;
        Swap(array, ChooseIndex, PivotIndex);
        int i = start;
        int j = end;
        while (i <= PivotIndex - 1 && j >= PivotIndex + 1) {
            while (array[i] <= Pivot) {
                i++;
            }
            while (array[j] > Pivot) {
                j--;
            }
            if (i <= PivotIndex - 1 && j >= PivotIndex + 1) {
                Swap(array, i, j);
                i++;
                j--;
            }
        }
        return PivotIndex;
    }

    public static void Swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        QuickSortR(array, 0, n - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
