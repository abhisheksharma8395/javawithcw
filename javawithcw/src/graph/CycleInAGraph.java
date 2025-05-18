package graph;

import java.util.*;

public class CycleInAGraph {
    public static boolean CycleInGraphDFS(List<List<Integer>> graph,int parent,int current,boolean[] visited) {
        visited[current] = true;
        for (int neighbour : graph.get(current)) {
            if(neighbour == parent) {
                continue;
            }
            else if (visited[neighbour]) {
                return true;
            }
            if(CycleInGraphDFS(graph,current,neighbour,visited)) {
                return true;
            }
        }
        return false;
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
        boolean[] visited = new boolean[n];
        if(CycleInGraphDFS(graph,-1,0,visited)){
            System.out.println("Cycle found");
        }
        else{
            System.out.println("Cycle not found");
        }
    }
}
