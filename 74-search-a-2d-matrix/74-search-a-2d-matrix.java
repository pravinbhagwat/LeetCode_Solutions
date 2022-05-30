class Solution {
    
    static boolean solution1(int[][] matrix, int target){
         int start = 0;
        int end = matrix.length - 1;
        int row = -1;
        
        while(start <= end){
            int mid = (start + end)  / 2;
            if(matrix[mid][0] == target) return true;
            else if(target < matrix[mid][0]) end = mid - 1;
            else{
                row = mid;
                start = mid + 1;
            }
            
        }
        
        if(row == -1) return false;
        
         start = 0;
         end = matrix[0].length - 1;
        
          while(start <= end){
            int mid = (start + end)/ 2;
            if(matrix[row][mid] == target) return true;
            else if(target < matrix[row][mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
            
        }
        
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        //return solution1(matrix, target);
        int r = matrix.length;
        int c = matrix[0].length;
        int start = 0;
        int end = (r * c) - 1;
        
        while(start <= end){
            int mid = (start + end) / 2;
            int rIdx = (mid / c);
            int cIdx = (mid % c);
            
            if(matrix[rIdx][cIdx] == target) return true;
            else if(target < matrix[rIdx][cIdx]) end = mid - 1;
            else start = mid + 1;
        }
        
        return false;
    }
}