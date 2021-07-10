import java.util.ArrayList;

public class l001 {
    public static class Edge {
        int v = 0, w = 0;

        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    // function to add edges
    public static void addEdge(ArrayList<Edge>[] graph, int u, int v, int w) {
        // for bidirectional graph
        graph[u].add(new Edge(v, w));
        graph[v].add(new Edge(v, w));

    }

    public static void display(ArrayList<Edge>[] graph) {
        int N = graph.length;

        // i will traverse for the vertices
        for (int i = 0; i < N; i++) {
            System.out.print(i + " --> ");
            // graph[i] has arraylist which stores the edges
            for (Edge e : graph[i]) {
                System.out.print("(" + e.v + ", " + e.w + ")");
            }

            System.out.println();
        }
    }

    // to find edge is present in which list , we have to return the index in that
    // list
    public static int findEdge(ArrayList<Edge>[] graph, int u, int v) {
        ArrayList<Edge> list = graph[u];

        for (int i = 0; i < list.size(); i++) {
            Edge e = list.get(i);
            if (e.v == v) {
                return i;
            }
        }
        return -1;
    }

    public static int removeEdge(ArrayList<Edge>[] graph, int u, int v) {

        int index = findEdge(graph, u, v);
        graph[u].remove(index);

        int index = findEdge(graph, v, u);
        graph[v].remove(index);
    }

    // hasPath
    public static boolean dfs_findPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis) {

        if (src == dest) {
            return true;
        }

        vis[src] = true;

        boolean res = false;
        // first task will be to ask neighbours of src to tell the path b/w them and
        // dest
        for (Edge e : graph[src]) {
            if (!vis[e.v]) {
                res = res || dfs_findPath(graph, e.v, dest, vis);
            }
        }

        return res;
    }

    // function for the graph
    public static void constructGraph() {

        int N = 7;
        ArrayList<Edge>[] graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }

        addEdge(graph, 0, 1, 10);
        addEdge(graph, 1, 2, 10);
        addEdge(graph, 2, 3, 40);
        addEdge(graph, 3, 0, 10);
        addEdge(graph, 3, 4, 2);
        addEdge(graph, 4, 5, 2);
        addEdge(graph, 5, 6, 3);
        addEdge(graph, 6, 4, 8);

        display(graph);
    }

    public static void main(String[] args) {
        constructGraph();
    }

}