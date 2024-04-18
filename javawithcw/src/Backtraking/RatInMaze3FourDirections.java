package Backtraking;

public class RatInMaze3FourDirections {
    private static void printpath(int sr,int sc,int er,int ec,String s,int[][] arr){
        if(sr>er || sc>ec) return;
        if(sr<0 || sc<0) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(arr[sr][sc]==0) return;
        arr[sr][sc]=0;
        printpath(sr+1,sc,er,ec,s+"D",arr);      //going Downwards
        printpath(sr,sc-1,er,ec,s+"L",arr);      //going Upwards
        printpath(sr,sc+1,er,ec,s+"R",arr);      //going Downwards
        printpath(sr-1,sc,er,ec,s+"U",arr);      //going Downwards
        arr[sr][sc]=1;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int er = 3;
        int ec = 4;
//        int er = sc.nextInt();
//        int ec = sc.nextInt();
//        int[][] arr = new int[er][ec];
//        for (int i = 0; i < er; i++) {
//            for (int j = 0; j < ec; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
        int[][] arr = {{1, 0, 1, 1}, {1, 1, 1, 1}, {1, 1, 0, 1}};
        printpath(0, 0, er - 1, ec - 1, "", arr);
    }
}
