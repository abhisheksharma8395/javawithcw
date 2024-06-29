package recursion;
import java.util.Scanner;
public class IsSorted {
    public static boolean IsSorted(int[] array, int idx) {
        if(idx== array.length){
            return true;
        }
        if(array[idx+1]<array[idx]){
            return false;
        }
        return IsSorted(array,idx);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(IsSorted(array, 0));
    }
}
