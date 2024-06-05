package arrays;
class ArrayExample{
    void demoArray(int a){
        int[] arr = {4,5,3,2,7,8};
        System.out.println(arr[a]);
    }
}
public class BasicsOfArrays {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int a = 5;
        arrayExample.demoArray(a);
    }
}
