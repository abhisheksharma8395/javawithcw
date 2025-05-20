package graph;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CovidSpread {
    public static class Pair{
        int row;
        int col;
        public Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public static boolean isValid(int[][] matrix,int row,int col){
        return (row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length);
    }
    public static int timeInCovidSpread(int[][] matrix){
        Queue<Pair> q = new LinkedList<>();
        int totalTime = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 2){
                    q.add(new Pair(i,j));
                }
            }
        }
        while(!q.isEmpty()){
            totalTime++;
            int total = q.size();
            while(total-->0){
                Pair pair = q.poll();
                int row = pair.row;
                int col = pair.col;
                int[] r = {0,1,0,-1};
                int[] c = {-1,0,1,0};
                for(int k = 0; k < 4; k++){
                    if(isValid(matrix,row+r[k],col+c[k])){
                        if(matrix[row+r[k]][col+c[k]] == 1){
                            matrix[row+r[k]][col+c[k]] = 2;
                            q.add(new Pair(row+r[k],col+c[k]));
                        }
                    }
                }
            }
        }
        for(int[] row : matrix){
            for(int col : row){
                if(col == 1){
                    return -1;  //Not all person infected
                }
            }
        }
        return totalTime > 0 ? totalTime-1 : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix row by row (only 0, 1, or 2):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
            //input matrix should contain 0,1 & 2 only
            //0 represents empty
            // 1 represents patient with mild fever and cold
            // 2 represents patient having covid

        System.out.print("Minimum covid spread time in Hospital is : ");
        int time = timeInCovidSpread(matrix);
        if(time == -1){
            System.out.println(-1+" Not all patients can be infected.");
        }
        else {
            System.out.println(time);
        }
    }
}
