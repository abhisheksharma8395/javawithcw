package recursion;
public class PrintTheElementOfAnArrayUsingRecursion {
    public static void printbyrec(int[] arr,int idx){
        //Base Case
        if(idx==0){
            System.out.println(arr[0]);
            return;
        }
        //Subproblems
        printbyrec(arr,idx-1);
        //Self Work
        System.out.println(arr[idx]);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{8,9,4,0,3,7};
        printbyrec(arr,5); //Method Call
    }
}
