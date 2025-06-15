package graph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// we can also  implement dijkstra using this method time complexity - O(V^2)
//but using priority queue it is VlogE so dijkstra using PriorityQueue is good is we have parse graph
// without priority Queue is good for Dense Graph
public class DijkstraWithoutPriorityQueue {
    public static class Pair{
        int vertex;
        int weight;
        Pair(int v,int w){
            this.vertex = v;
            this.weight = w;
        }
    }
    public static int[] dijkstra(List<List<Pair>> graph, int src) {
        int V = graph.size();
        boolean[] explore = new boolean[V];
        int[] distance = new int[V];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[src] = 0;
        for(int i = 0;i<V;i++){
            int j = -1;
            int min = Integer.MAX_VALUE;
            for(int k = 0;k<V;k++){
                if(!explore[k] && min>distance[k]){
                    min = distance[k];
                    j = k;
                }
            }
            for(Pair pair : graph.get(j)){
                int neighbour = pair.vertex;
                int weight = pair.weight;
                distance[neighbour] = Math.min(distance[neighbour],distance[j]+weight);
            }
            explore[j] = true;
        }
        return distance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Pair>> graph = new ArrayList<>();
        System.out.println("Enter the number of vertices");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            System.out.println("number of vertex connected with " + i + "th vertex");
            int v = sc.nextInt();
            System.out.println("Enter all " + v + " connected vertices and their respective weight:");
            for (int j = 0; j < v; j++) {
                graph.get(i).add(new Pair(sc.nextInt(), sc.nextInt()));
            }
        }
        int[] distance = new int[n];
        System.out.println("Enter the source vertex");
        distance = dijkstra(graph,sc.nextInt());
        for(int i : distance){
            System.out.print(i + " ");
        }
    }
}
