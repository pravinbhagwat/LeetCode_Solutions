// { Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.oddEven(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static String oddEven(String str) {
        // code here
        int n =  str.length();

      Map<Integer, Integer> hm = new HashMap<>();
      int Even=0, Odd = 0;
      
      for(int i = 0; i < n; i++){
        int ch = str.charAt(i);
        hm.put(ch-96, hm.getOrDefault(ch-96, 0) + 1);
      }

      for(Integer i : hm.keySet()){
        //System.out.print(i + " ");
        if(i%2==1 && hm.get(i) % 2 == 1){
          Odd++;
        }
        if(i%2==0 && hm.get(i) % 2 == 0){
          Even++;
        }        
      }
      if((Odd+Even)%2==0){
          return "EVEN";
      }
      return "ODD";
      //System.out.println((Odd+Even)%2==0 ? "EVEN" : "ODD");
      // for(Map.Entry m : hm.entrySet()){    
      //   System.out.println(m.getKey()+" "+m.getValue());    
      // }  
    }
}