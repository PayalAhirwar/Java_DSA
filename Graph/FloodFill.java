import java.util.*;

public class FloodFill{
    //O(m*n)
    public void helper(int image[][], int sr, int sc, int color, boolean vis[][], int orgCol) {
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }

        image[sr][sc] = color;
        //left
        helper(image,sr,sc-1,color,vis,orgCol);
        //right
        helper(image,sr,sc+1,color,vis,orgCol);
        //up
        helper(image,sr-1,sc,color,vis,orgCol);
        //down
        helper(image,sr+1,sc,color,vis,orgCol);
    }
    //constant TC
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,vis,image[sr][sc]);
        return image;
    }

    public static void main(String args[]) {
    int image[][] = {{1, 1, 1},
                     {1, 1, 0},
                     {1, 0, 1}};
    int sr = 1;
    int sc = 1;
    int color = 2;

    FloodFill floodFill = new FloodFill(); // Create an instance of the FloodFill class
    int[][] result = floodFill.floodFill(image, sr, sc, color); // Call the floodFill method on the instance

    // Print the result
    for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result[0].length; j++) {
            System.out.print(result[i][j] + " ");
        }
        System.out.println();
    }
}

}