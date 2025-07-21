package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class PrintUniqueSubsetsOfArray {
    public static void allSubsets(List<Integer> list,int[] arr, int index,List<List<Integer>> ansList) {
        if(index==arr.length) {
            ansList.add(new  ArrayList<>(list));
            return;
        }
        allSubsets(list,arr,index+1,ansList);
        list.add(arr[index]);
        allSubsets(list,arr,index+1,ansList);
        list.remove(list.size()-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ansList = new ArrayList<>();
        allSubsets(list,arr,0,ansList);
        System.out.println(ansList.toString());
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < ansList.size(); i++) {
            set.add(ansList.get(i));
        }
        System.out.println(set.toString());
    }
}
