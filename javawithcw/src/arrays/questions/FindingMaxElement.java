package arrays.questions;

import java.util.*;

public class FindingMaxElement {
    public static int MaxElementUsingRecursion(int[] array,int idx){
        int n = array.length;
        if(idx==n-1){
            return array[n-1];
        }
        return Math.max(array[idx],MaxElementUsingRecursion(array,idx+1));
    }
    public static int MaxElementUsingSorting(int[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }
    public static int MaxElementUsingCollection(int[] array){
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return Collections.max(list);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[5];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i : Array) {
            if(max<i){
                max=i;
            }
        }
        System.out.println("Max Element using for loop : "+max); //time complexity O(n)
        System.out.println("Sum using Sorting : " + MaxElementUsingSorting(Array)); //time complexity O(1)
        System.out.println("Sum using recursion : "+MaxElementUsingRecursion(Array,0)); //time complexity O(n)
        System.out.println("Sum using stream API : "+ Arrays.stream(Array).max().getAsInt()); //time complexity O(1)
        System.out.println("Sum using collections : "+MaxElementUsingCollection(Array)); //time complexity O(n)

    }
}
