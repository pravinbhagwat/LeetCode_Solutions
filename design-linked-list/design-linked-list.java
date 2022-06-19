

class MyLinkedList {
    
    class Node {
        Node next;
        int val;
        public Node() {}
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    //dummy head
    Node head;
    int size;

    public MyLinkedList() {
        this.size = 0;
        this.head = new Node(-1);
    }
    
    public int get(int index) {
        if(index >= this.size) return -1;
        Node curr = this.head;
        while(index-- >= 0) {
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node tmp = head.next;
        head.next = new Node(val);
        head.next.next = tmp;
        this.size++;
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        Node curr = this.head;
        while(index-- > 0) {
            curr = curr.next;
        }
        Node tmp = curr.next;
        curr.next = new Node(val);
        curr.next.next = tmp;
        this.size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size) return;
        Node curr = head;
        while(index-- > 0) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        this.size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */