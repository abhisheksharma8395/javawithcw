package recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class IndicesInArrayList {
    private static ArrayList<Integer> indecesinarraylist(int[] arr, int target, int idx) {
        ArrayList<Integer> ans = new ArrayList<>();  // we store the element from base case in this arraylist
        if (idx == arr.length) {    // Base Case
            return ans;  //return empty arraylist if element is not found
        }

        if (arr[idx]==target){      //self work
            ans.add(idx);
        }
        ArrayList<Integer> smallProblem = indecesinarraylist(arr, target, idx+1);
        ans.addAll(smallProblem);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        ArrayList<Integer> ans = indecesinarraylist(array, target, 0);
        for (Integer i : ans) {
            System.out.print(i+" ");
        }
    }
}
