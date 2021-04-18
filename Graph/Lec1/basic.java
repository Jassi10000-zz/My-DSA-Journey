import java.util.ArrayList;

public class basic {

    public static class Edge {
        int v = 0;
        int w = 0;

        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }

        public String toString() {
            return "(" + this.v + ", " + this.w + ")";
        }
    }

    public static int N = 7;
    public static ArrayList<Edge>[] graph = new ArrayList[N];

    public static void addEdge(int u, int v, int w) {

        // to form a bidirectional graph
        graph[u].add(new Edge(v, w));
        graph[v].add(new Edge(v, w));

    }

    public static void display() {

        for (int u = 0; u < N; u++) {
            System.out.print(u + " --> ");
            for (Edge e : graph[u]) {
                System.out.print(e);
            }
            System.out.println();
        }

    }

    //find the edge
    public static int findEdge(int u , int v){

        for( int i = 0 ; i <graph[u].size() ; i++){
            Edge e = graph[u].get(i);
            if(e.v == v) 
                return i;
            
        }
        return -1;
    }

    //remove the edge
    public static void removeEdge(int u , int v ){
        int idx1 = findEdge(u,v);
        int idx2 = findEdge(v,u);

        // if(idx1 = -1 || idx2 == -1){
        //     return;
        // }


        graph[u].remove(idx1);
        graph[v].remove(idx2);
       
        
    }

    
    // remove the vertex
    public static void removeVertex( int u ){
        while(graph[u].size() != 0){
            int n  = graph[u].size();
            Edge e  = graph[u].get(n-1); //getting the last no to not disturb the indexing 
            
            removeEdge(u , e.v);
        }

    }
    
    public  static boolean hasPath ( int source , int destination , boolean[] visited){

        boolean res = false;
        visited[source] = true;

        for(Edge e : graph[source]){
            
            if(!visited[e.v]){
                res = res || hasPath( e.v , destination , visited );
            }
        }

        return res;
    }

    public static void main(String[] args) {

        for (int u = 0; u < N; u++) {
            graph[u] = new ArrayList<>();
        }
        addEdge(0, 1, 10);
        addEdge(0, 3, 10);
        addEdge(1, 2, 16);
        addEdge(2, 3, 40);
        addEdge(3, 4, 2);
        addEdge(4, 5, 2);
        addEdge(4, 6, 8);
        addEdge(5, 6, 3);

        display();

        boolean[] visited = new boolean[N];
        System.out.println(hasPath(0,6,visited));
    }

}