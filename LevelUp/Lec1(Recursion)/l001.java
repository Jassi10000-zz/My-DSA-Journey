public class l001{
    // sr = starting row 
    // sc = starting column
    // er = ending row
    // ec = ending column 

    // String arrays of directions to keep track of the directions 
    public static int floodFill(int sr , int sc , int er , int ec , int[][] dir , String[] sdir , boolean[][] vis, String ans ){

        if( sr == er && sc == ec){
            System.out.println(ans + " " );
            return 1;
        }


        int count = 0;
        vis[sr][sc] = true;
        //let's work on directions
        for(int d=0;d<dir.length;d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if(r >= 0 && c >= 0 && r <= er && c <= ec && !vis[r][c]){
                count += floodFill(r , c , er , ec , dir , sdir , vis , ans + sdir[d] + " ");
            }
        }

        vis[sr][sc] = false;
        return count;
        
    }


    public static void main( String[] args ){
        int[][] dir = { { 0 , 1 } , { 0 , -1 } , { 1 , 0 } , { -1 , 0 }, { 1 , 1 } , { 1 , -1 } , { -1 , -1 } , { -1 , 1 } };
        String[] sdir = { "l" , "r" , "d" , "u" , "w" , "s" , "n" , "e"};

        int n = 4 , m = 4;
        boolean[][] vis = new boolean[n][m];

        System.out.println(floodFill(0 , 0 , n-1 , m-1 , dir , sdir , vis , ""));
    }
}