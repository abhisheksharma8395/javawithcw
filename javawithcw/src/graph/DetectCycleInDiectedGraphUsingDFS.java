package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetectCycleInDiectedGraphUsingDFS {
    public static boolean detectCycleDFS(List<List<Integer>> graph,int current,boolean[] Inpath,boolean[] IsVisited) {
        Inpath[current] = true;
        IsVisited[current] = true;
        for (int neighbour : graph.get(current)) {
            if(Inpath[neighbour]) {
                return true;   // Cycle detected
            }
            if(!IsVisited[neighbour]) {
                if(detectCycleDFS(graph,neighbour,Inpath,IsVisited)) {
                    return true;
                }
            }
        }
        Inpath[current] = false;   //Backtrack
        return false; //no cycle from this node
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
        boolean[] IsVisited = new boolean[n];
        boolean[] Inpath = new boolean[n];  // because visited method got fails in case of directed graph it is perfect
        boolean flag = false;              // for detect cycle in undirected graph
        for (int i = 0; i < n; i++) {
            if(!IsVisited[i] && detectCycleDFS(graph,i,Inpath,IsVisited)) {
                flag = true;
                break;
            }
        }
        if(flag) {
            System.out.println("Cycle found");
        }
        else {
            System.out.println("No cycle found");
        }
    }
}
