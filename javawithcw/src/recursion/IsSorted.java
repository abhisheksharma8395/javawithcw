package recursion;
import java.util.Scanner;
public class IsSorted {
    public static boolean issorted(int[] array, int idx) {
        if (idx == array.length-1) {                  //Base Case
            return (array[array.length-1]>=array[array.length-2]);
        }
        if (array[idx] > array[idx + 1]) {              // it checks for the array in ascending order
            return false;                               // Base Case
        }
        return issorted(array, idx + 1);            // Subproblem
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(issorted(array, 0));
    }
}
