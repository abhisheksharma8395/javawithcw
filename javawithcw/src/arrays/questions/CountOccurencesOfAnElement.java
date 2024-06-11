package arrays.questions;

import java.util.Scanner;

public class CountOccurencesOfAnElement {
    public static int countElementsIteratively(int[] array,int target){
        int count = 0;
        for(int i : array){
            if(i==target){
                count=count+1;
            }
        }
        return count;
    }
    public static int countElementsRecursively(int[] array,int idx,int target){
        if(idx>=array.length){
            return 0;
        }
        if(array[idx]==target){
             return 1+countElementsRecursively(array,idx+1,target);
        }
        return countElementsRecursively(array,idx+1,target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[8];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(countElementsIteratively(Array, target));
        System.out.println(countElementsRecursively(Array,0,target));
    }
}
