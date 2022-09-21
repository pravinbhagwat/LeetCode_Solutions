class Pair {
    int first, second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
class StockSpanner {
    Stack<Pair> st = new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int dayCount = 1;
        if(st.isEmpty()) {
            st.push(new Pair(price, dayCount));
        }
        else {
            while(!st.isEmpty() && price >= st.peek().first) {
                dayCount += st.peek().second;
                st.pop();
            }
            st.push(new Pair(price, dayCount));
        }
        
        return dayCount;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */