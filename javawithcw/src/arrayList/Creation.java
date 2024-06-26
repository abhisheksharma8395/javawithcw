package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Creation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Initialising ArrayList
        ArrayList<Integer> a1 = new ArrayList<>();
        // add new element to the ArrayList
        a1.add(5);
        a1.add(6);
        a1.add(7);
        a1.add(8);
        // get an element at index i
        System.out.println(a1.get(0));
        //print list by using for loop
        for (Integer integer : a1) {
            System.out.print(integer + " ");
        }
        //Printing list without using for loop
        System.out.println(a1);
        //Adding element at some index
        a1.add(1, 100);
        System.out.println(a1);
        //Modifying element at index i
        a1.set(1, 10);
        System.out.println(a1);
        //Removing an element at index i
        a1.remove(1);
        System.out.println(a1);
        //removing an element e
        a1.remove(Integer.valueOf(7));
        System.out.println(a1);
        //checking if an element exists or not
        boolean ans = a1.contains(Integer.valueOf(8));
        System.out.println(ans);
        //if you can't specify class of ArrayList you can put anything inside it
        ArrayList l = new ArrayList();
        l.add("pqres");
        l.add(1);
        l.add(true);
        System.out.println(l);


    }
}
