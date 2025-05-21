package graph;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class surroundedRegionOANDX {
    public static class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row = row;
            this.col = col;
        }
    }
    public static void printMatrix(char[][] board) {
        for (char[] row : board) {
            for (char col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    public static boolean isValid(char[][] board,int row,int col){
        return (row>=0 && col>=0 && row<board.length && col<board[0].length);
    }
    public static void solveBFS(char[][] board) {
        Queue<Pair> q = new LinkedList<>();
        int[] dr = {0,-1,0,1};
        int[] dc = {-1,0,1,0};
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(i==0 || j==0 || i==board.length-1 || j==board[0].length-1){
                    if(board[i][j] == 'O'){
                        board[i][j] = 'T';
                        q.add(new Pair(i,j));
                        while(!q.isEmpty()){
                            Pair pair = q.poll();
                            int row = pair.row;
                            int col = pair.col;
                            for(int k = 0;k<4;k++){
                                if(isValid(board,row+dr[k],col+dc[k]) && board[row+dr[k]][col+dc[k]] == 'O'){
                                    board[row+dr[k]][col+dc[k]] = 'T';
                                    q.add(new Pair(row+dr[k],col+dc[k]));
                                }
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='T'){
                    board[i][j]='O';
                }
            }
        }
        printMatrix(board);
    }
    public static void solveDFS(char[][] board) {
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(i==0 || j==0 || i==board.length-1 || j==board[0].length-1){
                    if(board[i][j] == 'O'){
                        dfs(board,i,j);
                    }
                }
            }
        }
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='T'){
                    board[i][j]='O';
                }
            }
        }
        printMatrix(board);
    }
    public static void dfs(char[][] board,int row,int col){
        int totalRow = board.length;
        int totalColumn = board[0].length;
        if(row<0 || col<0 || row>totalRow-1 || col>totalColumn-1 || board[row][col]!='O') return;
        board[row][col] = 'T';
        dfs(board,row+1,col);
        dfs(board,row,col+1);
        dfs(board,row,col-1);
        dfs(board,row-1,col);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int columns = sc.nextInt();
        if (rows == 0 || columns == 0) {
            System.out.println("Invalid input. Matrix cannot have zero rows or columns.");
            return;
        }
        char[][] matrix = new char[rows][columns];
        System.out.println("Enter the matrix row by row (only O & X):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        // if O surrounded by X from all side then convert that into X
        //input matrix should contain O & X only
        char[][] matrixBFS = new char[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {                          // copying matrix for BFS operation
            System.arraycopy(matrix[i], 0, matrixBFS[i], 0, matrix[0].length);
        }
        System.out.println("Matrix By BFS : ");
        solveBFS(matrixBFS);
        System.out.println("Matrix By DFS : ");
        solveDFS(matrix);
    }
}
