public class client {
    public static void main(String[] args) throws Exception {
        queue q = new queue(6);
        for (int i = 1; i < 6; i++) {
            q.push(i * 10);
        }
        System.out.println(q.display());
    }
}