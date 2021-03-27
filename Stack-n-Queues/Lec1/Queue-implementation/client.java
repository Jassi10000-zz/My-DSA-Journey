public class client {
    public static void main(String[] args) throws Exception {
        dynamicQueue q = new dynamicQueue(6);
        for (int i = 0; i < 6; i++) {
            q.push(i * 100);
        }
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());

        System.out.println(q);
    }
}