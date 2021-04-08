import java.util.PriorityQueue;

public class basic {
    public static void minPQ() {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // adding in a Priority Queue has total [nlogn] complexity
        for (int i = 10; i >= 0; i--) {
            pq.add(i); // add has [logn] complexity
        }

        while (pq.size() != 0) {
            int ele = pq.peek(); // this will give overall min element in Priority Queue
            pq.remove();
            System.out.println(ele);
        }
    }

    public static void maxPQ(){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            return a-b; // a is the 'this' and b is the 'other'
        });
        for (int i = 10; i >= 0; i--) {
            pq.add(i);
        }

        while (pq.size() != 0) {
            int ele = pq.peek();
            pq.remove();
            System.out.println(ele);
        }
    }

    public static void main() {
        minPQ();
        System.out.println();
        maxPQ();
    }
}