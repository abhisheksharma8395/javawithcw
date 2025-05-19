package graph;

import java.util.*;

public class CycleInUndirectedGraphUsingDFS {
    static class Pair {
        int parent;
        int child;
        public Pair(int child, int parent) {
            this.parent = parent;
            this.child = child;
        }
    }
    public static boolean CycleInGraphDFS(List<List<Integer>> graph,int parent,int current,boolean[] visited) {
        visited[current] = true;
        for(int neighbour : graph.get(current)) {
            if (neighbour == parent) {
                continue;
            }
            if (visited[neighbour]) {
                return true;
            }
            if(CycleInGraphDFS(graph,current,neighbour,visited)) {
                return true;
            }
        }
        return false;
    }
    public static boolean CycleInGraphDFSIterative(List<List<Integer>> graph,int current) {
        Stack<Pair> st = new Stack<>();
        boolean[] visited = new boolean[graph.size()];
        visited[current] = true;
        st.push(new Pair(current,-1));
        while(!st.isEmpty()) {
            Pair pair = st.pop();
            for(int neighbour : graph.get(pair.child)) {
                if(neighbour == pair.parent) {
                    continue;
                }
                if (visited[neighbour]) {
                    return true;
                }
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    st.push(new Pair(neighbour,pair.child));
                }
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
        if(CycleInGraphDFSIterative(graph,-1)) {
            System.out.println("Cycle found");
        }
        else{
            System.out.println("Cycle not found");
        }
    }
}
