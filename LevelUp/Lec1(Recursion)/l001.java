public class l001 {
    // sr = starting row
    // sc = starting column
    // er = ending row
    // ec = ending column

    // String arrays of directions to keep track of the directions
    public static int floodFill(int sr, int sc, int er, int ec, int[][] dir, String[] sdir, boolean[][] vis,
            String ans) {

        if (sr == er && sc == ec) {
            System.out.println(ans + "");
            return 1;
        }

        int count = 0;
        vis[sr][sc] = true;
        // let's work on directions
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r <= er && c <= ec && !vis[r][c]) {
                count += floodFill(r, c, er, ec, dir, sdir, vis, ans + sdir[d] + " ");
            }
        }

        vis[sr][sc] = false;
        return count;

    }

    public static class pathPair {

        int len = 0; // to keep a track of length of the path
        String path = "";

        int count = 0;

        pathPair(int len, String ans, int count) {
            this.len = len;
            this.ans = ans;
            this.count = count;
        }

    }

    // here pathPair will be treated as a return type
    public static pathPair floodfill_longestPath(int sr , int sc , int er , int ec , int[][] dir , String[] sdir , boolean[][] vis){

        if( sr == er && sc == ec){
            // the same values will be put in pathPair constructor
           pathPair(0,"",1);
        }

        int count = 0;
        vis[sr][sc] = true;
        pathPair myAns = new pathPair(0,"",0);


        //let's work on directions
        for(int d=0;d<dir.length;d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if(r >= 0 && c >= 0 && r <= er && c <= ec && !vis[r][c]){
                pathPair recursiveAns += floodfill_longestPath(r , c , er , ec , dir , sdir , vis );

                if(recursiveAns.len + 1  > myAns.len ){
                    myAns.len = recursiveAns.len + 1;
                    myAns.ans = sdir[d] + recursiveAns.ans;
                }

                //  we dont care whether upper "if" condition runs or not
                myAns.count += recursiveAns.count;
            }
        }

        vis[sr][sc] = false;
        return myAns;
        
    }

    public static pathPair floodfill_shortestPath(int sr , int sc , int er , int ec , int[][] dir , String[] sdir , boolean[][] vis){

        if( sr == er && sc == ec){
            // the same values will be put in pathPair constructor
           pathPair(0,"",1);
        }

        int count = 0;
        vis[sr][sc] = true;
        pathPair myAns = new pathPair(0,"",0);


        //let's work on directions
        for(int d=0;d<dir.length;d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if(r >= 0 && c >= 0 && r <= er && c <= ec && !vis[r][c]){
                pathPair recursiveAns += floodfill_shortestPath(r , c , er , ec , dir , sdir , vis );

                if(recursiveAns.len + 1  < myAns.len ){
                    myAns.len = recursiveAns.len + 1;
                    myAns.ans = sdir[d] + recursiveAns.ans;
                }

                //  we dont care whether upper "if" condition runs or not
                myAns.count += recursiveAns.count;
            }
        }

        vis[sr][sc] = false;
        return myAns;
        
    }

    public static void main(String[] args) {
        int[][] dir = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 }, { 1, 1 }, { 1, -1 }, { -1, -1 }, { -1, 1 } };
        String[] sdir = { "l", "r", "d", "u", "w", "s", "n", "e" };

        int n = 4, m = 4;
        boolean[][] vis = new boolean[n][m];

        System.out.println(floodFill(0, 0, n - 1, m - 1, dir, sdir, vis, ""));

        pathPair answer =  floodfill_shortestPath(0 , 0 , n-1 , n-1 , dir , sdir , vis );

        System.out.println(" path ---> " + answer.ans + "\n" + "count --> " + answer.count); 
    }
}