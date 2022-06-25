class Solution {
    public String mergeAlternately(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int len1 = s1.length();
          int len2 = s2.length();
          int i = 0;
          while(i < len1 || i < len2){
            if(i < len1){
              sb.append(s1.charAt(i));
            }
            if(i < len2){
              sb.append(s2.charAt(i));
            }
            i++;
          }
          return sb.toString();
    }
}