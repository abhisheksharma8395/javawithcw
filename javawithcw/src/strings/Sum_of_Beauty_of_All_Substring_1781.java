package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_Beauty_of_All_Substring_1781 {
    public static int Beauty(String s){
        if(s.isEmpty()){
            return 0;
        }
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch-97;
            arr[idx]++;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if(i>0){
                max = Math.max(max,i);
                min = Math.min(min,i);
            }
        }
        return max-min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.isEmpty()){
            System.out.println(0);
        }
        int n = s.length();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                count += Beauty(s.substring(i,j));
            }
        }
        System.out.println(count);
    }
}
