class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int zero = 0;
        int two = n-1;
        
        for(int i = 0; i < n; ) {
            if(i > two) break;
            if(arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[zero];
                arr[zero] = temp;
                
                zero++;
                i++;
            }
            else if(arr[i] == 1) {
                i++;
            }
            else {
                int temp = arr[i];
                arr[i] = arr[two];
                arr[two] = temp;
                //i++;
                two--;
            }
        }
    }
}