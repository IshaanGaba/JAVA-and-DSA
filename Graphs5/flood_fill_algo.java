package Graphs5;

public class flood_fill_algo {
    public static void helper(int image[][],int sr,int sc,int color,boolean vis[][],int last) {
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || 
        image[sr][sc]!=last || vis[sr][sc]){
            return;
        }
        if(image[sr][sc]==last){
            image[sr][sc]=color;
        }
        //left
        helper(image, sr, sc-1, color, vis, last);

        //right
        helper(image, sr, sc+1, color, vis, last);

        //up
        helper(image, sr-1, sc, color, vis, last);

        //down
        helper(image, sr+1, sc, color, vis, last);
    }
    public static int[][] flood(int image[][],int sr,int sc,int color) {
        boolean vis[][]=new boolean[image.length][image[0].length];
        int last=image[sr][sc];
        helper(image,sr,sc,color,vis,last);
        return image;
    }
    public static void main(String[] args) {
        int image[][]={{1,1,1},{1,1,0},{1,0,1}};
        int sr=1;//starting row
        int sc=1;//starting column
        int color=2;
        flood(image, sr, sc, color);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
}
