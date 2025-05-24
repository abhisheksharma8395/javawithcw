package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
