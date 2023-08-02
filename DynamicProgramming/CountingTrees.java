//similar to Catalan numbers
import java.util.*;

public class CountingTrees{
    
    //O(n*n)
    public static int countBST(int n) {
         int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++) { //Ci
            for(int j=0; j<i; j++) {
                // dp[i] += dp[j] * dp[i-j-1]; //Ci = Cj * Ci-j-1
                int left = dp[j];
                int right = dp[i-j-1];
                dp[i] += left * right;
            }
        }
        return dp[n];
    }

    public static void main(String args[]) {
        int arr[] = {10,20,30,40};
        System.out.println(countBST(arr.length));
    }
}