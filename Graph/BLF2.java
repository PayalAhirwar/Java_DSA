import java.util.*;
//Solution 2 with same time complexity
public class BLF2 {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph2(ArrayList<Edge> graph[]) {
    
        graph.add(new Edge(0,1,2));
        graph.add(new Edge(0,2,4));

        graph.add(new Edge(1,2,-4));
       // graph[1].add(new Edge(1,3,1));

        graph.add(new Edge(2,3,2));
       // graph[2].add(new Edge(2,4,1));

       // graph[3].add(new Edge(3,1,1));
        graph.add(new Edge(3,4,4));

        graph.add(new Edge(4,1,-1));
        //graph[4].add(new Edge(4,3,1));
     }

     public class void bellmanFord(ArrayList<Edge> graph, int src, int V) {
        int dist[] = new int[V];
        for(int i=0; i<dist.length; i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        //O(V+E)
        //algo - O(V)
        for(int i=0; i<V-1; i++) {

        for(int j=0; j<graph.size(); j++) {
            Edge e = graph.get(j);
            //u,v,wt
            int u = e.src;
            int v = e.dest;
            int wt = e.wt;

            //relaxation
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }            
        }
        
     }
        }

     public static void main(String args[]) {
        int V=5;
        // ArrayList<Edge> graph[] = new ArrayList[V];
        ArrayList<Edge> edges = new ArrayList<>();
        // createGraph(graph);
        createGraph2(graph);
        bellmanFord(graph,0,V);
     }
}