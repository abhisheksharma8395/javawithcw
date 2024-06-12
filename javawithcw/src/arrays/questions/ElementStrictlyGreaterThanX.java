package arrays.questions;

import java.util.Scanner;

public class ElementStrictlyGreaterThanX {
    public static int StrictlyGreaterUsingIterative(int[] array,int target){
        int GreaterthanX = 0;
        for (int i : array){
            if(i>target){
                GreaterthanX+=1;
            }
        }
        return GreaterthanX;
    }
    public static int StrictlyGreaterUsingRecursive(int[] array,int idx,int target){
        if(idx>= array.length){
            return 0;
        }
        if(array[idx]>target){
            return 1+StrictlyGreaterUsingRecursive(array, idx+1, target);
        }
        return StrictlyGreaterUsingRecursive(array, idx+1, target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[5];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println("Count of Greater Elements than "+target+" in Array using iterative method is "+StrictlyGreaterUsingIterative(Array,target));
        System.out.println("Count of Greater Element than "+target+" in Array using recursive backward method is "+StrictlyGreaterUsingRecursive(Array,0,target));
    }
}
