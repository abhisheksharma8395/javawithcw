package arrays;



class ArrayExample{
    void multidimensonal(){
        int[][] arr = {{1,4,2},{1,3,4},{7,5,6},{4,9,2}};
        int[][][] array = {{{1,2},{2,4}},{{4,5},{6,2}}};
        System.out.println(arr[2][2]);
        System.out.println(array[1][1][0]);
    }
    void traversing(){
        int[] singleDArray = {5,10,15,20,25,30};
        int[][] arr = {{1,2},{2,4},{4,5},{6,2}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        for(int i : singleDArray){         //for each loop
            System.out.println(i);
        }
    }
    void traversingR(int[] arr,int idx){
        int n = arr.length;
        if(idx >= n){
            return;
        }
        System.out.println(arr[idx]);
        traversingR(arr,idx+1);
    }
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
        arrayExample.multidimensonal();
        arrayExample.traversing();
    }
}
