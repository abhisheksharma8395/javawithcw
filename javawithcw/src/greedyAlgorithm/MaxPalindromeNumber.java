package greedyAlgorithm;

import java.util.Scanner;

public class MaxPalindromeNumber {
    public static String isPalindrome(String number) {
        int length = number.length();
        StringBuilder front = new StringBuilder();
        StringBuilder back = new StringBuilder();
        int[] freq = new int[10];
        for(int i=0; i<length; i++) {
            freq[number.charAt(i)-'0']++;
        }
        boolean flag = true;
        int i = 9;
        int mid = length/2;
        char c = '0';  //middile character for odd length
        if(length % 2 == 0) {                               //for even length
            while(i >= 0){
                if(freq[i] > 0) {
                    if (freq[i] % 2 == 0) {
                        int a = freq[i] / 2;
                        for (int j = 0; j <  a; j++) {
                            front.append(i);
                            back.append(i);
                        }
                    }
                    else if(freq[i] % 2 == 1){
                        return "Not Possible";
                    }
                }
                i--;
            }
        }
        else{                                                 //for odd length
            while(i >= 0){
                if(freq[i] > 0) {
                    if (freq[i] % 2 == 0) {
                        int a = freq[i] / 2;
                        for (int j = 0; j <  a; j++) {
                            front.append(i);
                            back.append(i);
                        }
                    }
                    else if(freq[i] % 2 == 1 && flag){
                        int a = freq[i] / 2;
                        c = (char)(i+'0');
                        for (int j = 0; j <  a; j++) {
                            front.append(i);
                            back.append(i);
                        }
                        flag = false;
                    }
                    else if(freq[i] % 2 == 1 && flag){
                        return "Not Possible";
                    }

                }
                i--;

            }
            front.append(c);
        }
        return front.append(back.reverse()).toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = sc.next();
        System.out.println(isPalindrome(number));
    }
}
