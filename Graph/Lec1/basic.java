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
    }

}