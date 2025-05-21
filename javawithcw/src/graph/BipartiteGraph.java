package graph;
import java.util.*;
public class BipartiteGraph {
    public static boolean IsBipartiteGraphBFS(List<List<Integer>> graph,int current,int[] colors) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(current);
        colors[current] = 0;          // 0-Red 1-Blue
        while (!queue.isEmpty()) {
            current = queue.poll();
            for(int neighbours : graph.get(current)) {
                if(colors[neighbours] == -1) {
                    colors[neighbours] = 1-colors[current];
                    queue.add(neighbours);
                } else{
                    if(colors[neighbours] == colors[current]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean IsBipartiteGraphDFS(List<List<Integer>> graph,int current,int[] colors) {
        for(int neighbours : graph.get(current)) {
            if(colors[neighbours] == -1) {
                colors[neighbours] = 1-colors[current];
                if(!IsBipartiteGraphDFS(graph, neighbours, colors)) {
                    return false;
                }
            }
            else{
                if(colors[neighbours] == colors[current]) return false;
            }
        }
        return true;
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
        int[] colorsBFS = new int[graph.size()];
        Arrays.fill(colorsBFS, -1);
        boolean flag = true;
        for (int i = 0; i < colorsBFS.length; i++) {
            if(colorsBFS[i] == -1 && !IsBipartiteGraphBFS(graph, i, colorsBFS)) {
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Bipartite graph by BFS Traversal");
        }
        else{
            System.out.println("Not Bipartite graph by BFS Traversal");
        }
        int[] colorsDFS = new int[graph.size()];
        Arrays.fill(colorsDFS, -1);
        boolean flagDFS = true;
        for (int i = 0; i < colorsBFS.length; i++) {
            if(colorsDFS[i] == -1) {
                colorsDFS[i] = 0;
                if(!IsBipartiteGraphDFS(graph, i, colorsDFS)) {
                    flagDFS = false;
                    break;
                }
            }
        }
        if(flagDFS){
            System.out.println("Bipartite graph by DFS Traversal");
        }
        else{
            System.out.println("Not Bipartite graph by DFS Traversal");
        }
    }
}
