package arrays;

public class NextGreaterElementByArray {
    public static int[] nge(int[] arr1){
        int[] arr2=new int[arr1.length];
        for (int i = 0; i <arr1.length; i++) {
            arr2[i]=-1;
            for (int j = i+1; j <arr1.length ; j++) {
                if(arr1[j]>arr1[i]){
                    arr2[i]=arr1[j];
                    break;
                }
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        int[] arr={1,5,6,2,4,1,3,9,8,7};
        int[] res=nge(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
}
