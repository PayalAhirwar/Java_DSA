//similar to catalan numbers
import java.util.*;

public class MountainRanges{

    //O(n*n)
    public static int mountainRanges(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++) { //Ci
            //i pairs -> mountain ranges => Ci
            for(int j=0; j<i; j++) {
                // dp[i] += dp[j] * dp[i-j-1]; //Ci = Cj * Ci-j-1
                int inside = dp[j];
                int outside = dp[i-j-1];
                dp[i] += inside * outside;
            }
        }
        //n pairs
        return dp[n];
    }


    public static void main(String args[]) {
       int n = 4; //14
       System.out.println(mountainRanges(n));
    }
}