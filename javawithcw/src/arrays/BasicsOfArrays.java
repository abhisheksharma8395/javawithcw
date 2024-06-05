package arrays;

import java.sql.SQLOutput;

class ArrayExample{
    void demoArray(int a){
        int[] arr = {4,5,3,2,7,8};
        float[] weight = {23.57f,24.63f,89.26f,20.38f,78.22f,96.88f};
        String[] name = {"Hathras","Hardoi","hamirpur","Agra","Etah","Mathura"};
        System.out.println(arr[a]);
        System.out.println(weight[a]);
        System.out.println(name[a]);
    }
}
public class BasicsOfArrays {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int a = 5;
        arrayExample.demoArray(a);
    }
}
