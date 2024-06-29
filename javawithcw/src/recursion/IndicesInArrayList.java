package recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class IndicesInArrayList {
    private static ArrayList<Integer> indecesinarraylist(int[] arr, int target, int idx) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(idx==arr.length){
            return ans;
        }
        if(arr[idx]==target){
            ans.add(idx);
        }
        ArrayList<Integer> SmallAns = indecesinarraylist(arr,target,idx+1);
        ans.addAll(SmallAns);
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
