import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class RoottoNodePath {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }

                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static boolean find(Node root, int data, ArrayList<Integer> ans) {

        if (root == null)
            return false;

        boolean res = (root.data == data);
        if (res) {
            ans.add(root.data);
        }
        return res || find(root.left, data, ans) || find(root.right, data, ans);

    }

    // Faith : Ham pehle se hi path mein included hai

    static ArrayList<Integer> path = new ArrayList<>();

    public static boolean Helper(Node node, int data) {
        if (node == null)
            return false;

        boolean res = (node.data == data) || Helper(node.left, data) || Helper(node.right, data);
        if (res) {
            path.add(node.data);
        }

        return res;

    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> ans) {

        ArrayList<Integer> rev = new ArrayList<>();

        for (int i = ans.size() - 1; i >= 0; i--) {
            rev.add(ans.get(i));
        }

        return rev;
    }

    public static ArrayList<Integer> Root2NodePath(Node root, int data) {
        // write your code here

        Helper(root, data);
        return reverse(path);

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        int data = Integer.parseInt(br.readLine());

        Node root = construct(arr);

        ArrayList<Integer> path = Root2NodePath(root, data);
        System.out.println(path);
    }

}