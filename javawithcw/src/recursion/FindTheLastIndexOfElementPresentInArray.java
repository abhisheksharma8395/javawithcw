package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class FindTheLastIndexOfElementPresentInArray {
    public static int findlastindex(int[] array,int target,int idx){
        int last = -1;
        if(idx == array.length){   //Base Case
            return last;
        }
        if(array[idx] == target){
            last = idx;
        }
        int subproblems = findlastindex(array, target, idx+1);
        if(subproblems > last){
            return subproblems;
        }
        return last;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(findlastindex(array,target,0));
    }
}
