package arrays;

import java.util.Scanner;

public class FindTheLastOccurenece {
    public static int lastOccurrenceUsingIterative(int[] array,int target){
        int lastOccur = -1;
        for (int i=0;i<array.length;i++){
            if(array[i]==target){
                lastOccur=i;
            }
        }
        return lastOccur;
    }
    public static int lastOccurrenceUsingRecursiveBackward(int[] array,int idx,int target){
        if(idx<0){
            return -1;
        }
        if(array[idx]==target){
            return idx;
        }
        return lastOccurrenceUsingRecursiveBackward(array, idx-1, target);
    }
    public static int lastOccurrenceUsingRecursiveForward(int[] array,int idx,int target){
        if(idx>=array.length){
            return -1;
        }
        if(array[idx]==target){
            return Math.max(idx,lastOccurrenceUsingRecursiveForward(array,idx+1,target));
        }
        return lastOccurrenceUsingRecursiveForward(array,idx+1,target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[5];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println("last occurrence index of "+target+" in Array using iterative method is "+lastOccurrenceUsingIterative(Array,target));
        System.out.println("last occurrence index of "+target+" in Array using recursive backward method is "+lastOccurrenceUsingRecursiveBackward(Array,Array.length-1,target));
        System.out.println("last occurrence index of "+target+" in Array using recursive forward method is "+lastOccurrenceUsingRecursiveForward(Array,0,target));
    }

}
