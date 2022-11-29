//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s[] = read.readLine().split(" ");
            double X1, Y1, R1, X2, Y2, R2;
            X1 = Double.parseDouble(s[0]);
            Y1 = Double.parseDouble(s[1]);
            R1 = Double.parseDouble(s[2]);
            X2 = Double.parseDouble(s[3]);
            Y2 = Double.parseDouble(s[4]);
            R2 = Double.parseDouble(s[5]);
            Solution ob = new Solution();
            long ans = ob.intersectionArea(X1, Y1, R1, X2, Y2, R2);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long intersectionArea(double X1, double Y1, double R1, double X2, double Y2,
                          double R2) {
        // code here
        double Pi = 3.14;
        double d, alpha, beta, a1, a2;
        long ans;
 
        // Calculate the euclidean distance
        // between the two points
        d = Math.sqrt((X2 - X1) * (X2 - X1)
                      + (Y2 - Y1) * (Y2 - Y1));
 
        if (d > R1 + R2)
            ans = 0;
 
        else if (d <= (R1 - R2) && R1 >= R2)
            ans = (long)Math.floor(Pi * (double)R2
                                  * (double)R2);
 
        else if (d <= (R2 - R1) && R2 >= R1)
            ans = (long)Math.floor(Pi * (double)R1
                                  * (double)R1);
 
        else {
            alpha = Math.acos((R1 * R1 + d * d - R2 * R2)
                              / (2 * R1 * d))
                    * 2;
            beta = Math.acos((R2 * R2 + d * d - R1 * R1)
                             / (2 * R2 * d))
                   * 2;
            a1 = 0.5 * beta * R2 * R2
                 - 0.5 * R2 * R2 * Math.sin(beta);
            a2 = 0.5 * alpha * R1 * R1
                 - 0.5 * R1 * R1 * Math.sin(alpha);
            ans = (long)Math.floor(a1 + a2);
        }
 
        return ans;
    }
};