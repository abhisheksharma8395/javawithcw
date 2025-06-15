package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EulerPathAndEulerCircuit {
    //Make indegree array and put the count of edges in that array
    //if array does not have any vertex with odd indegree there might be the possibility of euler circuit
    //make visited array and perform BFS/DFS
    // if any vertex having indegree greater than once and not visited then there is no euler circuit
    //in case of euler path you might have 2 vertex with odd indegree or 0 vertex with odd indegree
    //same work for euler path as of euler circuit
    public static int isEulerCircuit(int V, List<List<Integer>> graph) {
        int oddCount = 0;
        for(int i = 0;i<V;i++){
            if(graph.get(i).size()%2!=0) oddCount++;
        }
        if(oddCount==1 || oddCount>2) return 0;
        boolean[] isVisited = new boolean[V];
        for(int i = 0;i<V;i++){
            if(!graph.get(i).isEmpty()){
                DFS(graph,i,isVisited);
                break;
            }
        }
        for(int i = 0;i<V;i++){
            if(!isVisited[i] && !graph.get(i).isEmpty()){
                return 0;
            }
        }
        return oddCount == 2 ? 1 : 2;

    }
    public static void DFS(List<List<Integer>> adj,int current,boolean[] isVisited){
        isVisited[current] = true;
        for(int neighbour : adj.get(current)){
            if(!isVisited[neighbour]){
                DFS(adj,neighbour,isVisited);
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
            System.out.println("number of vertex connected with " + i + "th vertex");
            int v = sc.nextInt();
            System.out.println("Enter all " + v + " connected vertices :");
            for (int j = 0; j < v; j++) {
                int to = sc.nextInt();
                graph.get(i).add(to);
                graph.get(to).add(i);
            }
        }
        int V = graph.size();
        int ans = isEulerCircuit(V,graph);
        switch(ans){
            case 0:
                System.out.println("Neither Euler Circuit nor Euler Path found");
                break;
            case 1:
                System.out.println("Euler Path founded");
                break;
            case 2:
                System.out.println("Euler Circuit found");
                break;
        }
    }
}
