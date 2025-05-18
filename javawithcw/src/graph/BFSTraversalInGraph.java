package graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BFSTraversalInGraph {
    public static void BfsTraversalInGraph(List<List<Integer>> graph){
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[] visited = new boolean[graph.size()];
        if(graph.isEmpty()){
            return;
        }
        queue.add(0);
        System.out.print(0+" ");
        visited[0] = true;
        while(!queue.isEmpty()){
            int current = queue.remove();
            for(int neighbour : graph.get(current)){
                if(!visited[neighbour]){
                    queue.add(neighbour);
                    visited[neighbour] = true;
                    System.out.print(neighbour+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> graph = new ArrayList<>();
        System.out.println("Enter the number of vertices");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            System.out.println("number of vertex connected with "+i+"th vertex");
            int v = sc.nextInt();
            System.out.println("Enter all " + v + " connected vertices:");
            for(int j = 0; j < v; j++){
                graph.get(i).add(sc.nextInt());
            }
        }
        BfsTraversalInGraph(graph);
    }
}
