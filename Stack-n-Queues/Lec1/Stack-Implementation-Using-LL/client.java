public class client {

    public static void main(String[] args) {

        stack st = new stack(15);

        for (int i = 1; i < 7; i++) {
            st.push(i * 10);
        }

        while (st.size != 0) {
            st.pop();
        }
    }
}