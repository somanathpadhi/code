package programs.dsa._6_linkedlist;


public class SLL {

    static class SLLNode {

        int data;
        SLLNode next;

        //constructor
        SLLNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    SLLNode head;
    SLLNode tail;
    int size;

    //constructor
    SLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // ====================
    // Insertion
    // ====================

    // Insert at beginning
    public void insertAtHead(int data) {
        SLLNode newNode = new SLLNode(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Insert at end
    public void insertAtTail(int data) {
        SLLNode newNode = new SLLNode(data);
        if (head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;

    }

    // Insert at position | position is 1 based indexing
    public void insertAtPosition(int data) {
        //TODO
    }


    // ====================
    // Traversal
    // ====================

    public void printList() {
        if (head == null){
            System.out.println("Linked list is empty!");
        }
        SLLNode curr = head;

        while (curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }

    // ====================
    // Utility Functions
    // ====================

    public int getSize() {
        //TODO
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getHead() {
        //TODO
        return -1;
    }

    public int getTail() {
        //TODO
        return -1;
    }

    public void clear() {
        //TODO
    }


    // ====================
    // Deletion
    // ====================

    // Delete first
    public void deleteHead() {
        //TODO
    }

    // Delete end
    public void deleteTail() {
        //TODO
    }

    // Delete at position | position is 1 based indexing
    public void deleteAtPosition(int position) {
        //TODO
    }

    // ====================
    // Searching
    // ====================

    // Returns true if value exists
    public boolean search(int target) {
        //TODO
        return false;
    }

    // Returns 1-based position
    public int findPosition(int target) {
        //TODO
        return -1;
    }

    // ====================
    // Update
    // ====================

    // Update using position
    public void updateUsingPosition(int position, int data) {
        //TODO
    }

    // Update first occurrence of value
    public boolean updateValue(int oldValue, int newValue) {
        //TODO
        return false;
    }




    static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAtHead(5);
        sll.insertAtHead(4);
        sll.insertAtHead(3);
        sll.insertAtTail(9);
        sll.insertAtTail(10);
        sll.printList();
    }

}
