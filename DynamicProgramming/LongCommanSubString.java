import java.util.*;

public class LongCommanSubString{

     public static void print(int dp[][]) {
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
    

    //O(n*m)
    public static int longestCommanSubstring(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int ans = 0;
        int dp[][] = new int[n+1][m+1];

        //initialize
        for(int i=0; i<n+1; i++) {
           dp[i][0] = 0;
        }
        for(int j=0; j<m+1; j++) {
            dp[0][j] = 0;
        }

        //bottem up
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
            }
            print(dp);
            return ans;
    }  

    public static void main(String args[]) {
        String str1 = "ABCDE";
        String str2 = "ABGCE"; // ans = 2
        System.out.println(longestCommanSubstring(str1, str2));
    }
}