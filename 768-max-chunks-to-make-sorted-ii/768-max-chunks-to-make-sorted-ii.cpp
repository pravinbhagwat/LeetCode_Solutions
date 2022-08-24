class Solution {
public:
    int maxChunksToSorted(vector<int>& arr) {
        int size=arr.size(),ans=0,me;
        stack<int> s;
        for(int i=0;i<size;i++){
            me=arr[i];
            while(!s.empty() && arr[i]<s.top()){
                me=max(me,s.top());
                s.pop();
            }
            s.push(me);
        }
        return s.size();
    }
};