class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        // Appraoch 1
//         int zero = 0;
//         int two = n-1;
        
//         for(int i = 0; i < n; ) {
//             if(i > two) break;
//             if(arr[i] == 0) {
//                 int temp = arr[i];
//                 arr[i] = arr[zero];
//                 arr[zero] = temp;
                
//                 zero++;
//                 i++;
//             }
//             else if(arr[i] == 1) {
//                 i++;
//             }
//             else {
//                 int temp = arr[i];
//                 arr[i] = arr[two];
//                 arr[two] = temp;
//                 //i++;
//                 two--;
//             }
//         }
        
        // Approach-2
        int Zcount = 0;
        int Ocount = 0;
        int Tcount = 0;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) Zcount++;
            if(arr[i] == 1) Ocount++;
            if(arr[i] == 2) Tcount++;
        }
        int i = 0;
        while(Zcount-- > 0){
            arr[i] = 0;
            i++;
        }
        while(Ocount-- > 0){
            arr[i] = 1;
            i++;
        }
        while(Tcount-- > 0){
            arr[i] = 2;
            i++;
        }
        
    }
}