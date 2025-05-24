package graph;

import java.util.*;
public class DijkstraAlgorithm {
    public static class Node{
        int id;
        String name;
        public Node(int id,String name){
            this.id = id;
            this.name = name;
        }
    }
    public static class Pair implements Comparable<Pair> {
        int vertex;
        int weight;
        public Pair(int v,int w){
            this.vertex = v;
            this.weight = w;
        }
        @Override
        public int compareTo(Pair other) {
            return this.weight - other.weight;
        }
    }
    public static class Graph{
        private final List<Node> nodes;
        private final List<List<Pair>> adjacencyList;
        public Graph(){
            nodes = new ArrayList<>();
            adjacencyList = new ArrayList<>();
        }
        public void addNode(Node node){
            nodes.add(node);
            adjacencyList.add(new ArrayList<>());
        }
        public void addEdge(int i, int j,int weight){
            adjacencyList.get(i).add(new Pair(j,weight));
            adjacencyList.get(j).add(new Pair(i,weight));  //for undirected graph
        }
        public void removeEdge(int i, int j){
            List<Pair> ConnectedToI = adjacencyList.get(i);
            for (int k = 0; k < ConnectedToI.size(); k++) {
                if(ConnectedToI.get(k).vertex == j){
                    ConnectedToI.remove(k);
                    break;
                }
            }
            List<Pair> ConnectedToJ = adjacencyList.get(j);
            for (int k = 0; k < ConnectedToJ.size(); k++) {
                if(ConnectedToJ.get(k).vertex == i){
                    ConnectedToJ.remove(k);
                    break;
                }
            }

        }
        public void Dijkstra(int src){
            PriorityQueue<Pair> pq = new PriorityQueue<>();
            int V = adjacencyList.size();
            boolean[] explore = new boolean[V];
            int[] distance = new int[V];
            Arrays.fill(distance,Integer.MAX_VALUE);
            int[] parent = new int[V];
            Arrays.fill(parent, -1);
            pq.add(new Pair(src,0));
            distance[src] = 0;
            while(!pq.isEmpty()){
                Pair temp = pq.poll();
                int current = temp.vertex;
                if (explore[current]) continue;
                explore[current] = true;
                for(Pair neighbourhood : adjacencyList.get(current)){
                    int neighbour = neighbourhood.vertex;
                    int neighbourWeight = neighbourhood.weight;
                    if (!explore[neighbour] && distance[current] + neighbourWeight < distance[neighbour]) {
                        distance[neighbour] = distance[current] + neighbourWeight;
                        parent[neighbour] = current;
                        pq.add(new Pair(neighbour, distance[neighbour]));
                    }
                }
            }
            System.out.print(nodes.get(src).name+" -> ");
            for(int i = 0; i < V; i++){
                if(i != src){
                    if(distance[i] == Integer.MAX_VALUE){
                        System.out.print("( " + nodes.get(i).name + ", Unreachable ) ");
                    } else {
                        System.out.print("( " + nodes.get(i).name + ", Distance = " + distance[i] + ", Path = ");
                        printPath(parent, i);
                        System.out.print(" ) ");
                    }
                }
            }
        }
        public void printPath(int[] parent, int target){
            if (parent[target] == -1) {
                System.out.print(nodes.get(target).name);
                return;
            }
            printPath(parent, parent[target]);
            System.out.print(" -> " + nodes.get(target).name);
        }
        public void printGraph(){
            for (int i = 0; i < nodes.size(); i++) {
                System.out.print(nodes.get(i).name+"->");
                for(Pair j : adjacencyList.get(i)){
                    System.out.print("("+nodes.get(j.vertex).name+","+j.weight+") ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Cities : ");
        int numberOfNodes = sc.nextInt();
        System.out.println(" ");
        Graph graph = new Graph();
        for(int i = 0;i<numberOfNodes;i++){
            System.out.print("Enter the name of "+i+"th city: ");
            graph.addNode(new Node(i,sc.next()));
        }
        System.out.print("Do you want to add edges to the graph? (true/false): ");
        boolean flag = sc.nextBoolean();
        while(flag){
            for(int i = 0;i<numberOfNodes;i++){
                System.out.println(graph.nodes.get(i).id+"->"+ graph.nodes.get(i).name);
            }
            System.out.print("Enter the from city id and to city id and Distance between them respectively: ");
            int fromCityId = sc.nextInt();
            int toCityId = sc.nextInt();
            int weight = sc.nextInt();
            graph.addEdge(fromCityId,toCityId,weight);
            System.out.println(" ");
            System.out.print("If you want to continue write true otherwise false : ");
            flag = sc.nextBoolean();
        }
        System.out.println("Adjacency List is");
        graph.printGraph();
        System.out.println("Want to find out minimum distance from a source node ?");
        System.out.println("Write true if you want otherwise false");
        boolean flag1 = sc.nextBoolean();
        if(flag1){
            for(int i = 0;i<numberOfNodes;i++){
                System.out.println(graph.nodes.get(i).id+"->"+ graph.nodes.get(i).name);
            }
            System.out.println("Please enter the source location from which you want minimum distance");
            int src = sc.nextInt();
            graph.Dijkstra(src);
        }
    }
}
