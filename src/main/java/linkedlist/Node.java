package linkedlist;

/**
 * @Author: Liam
 * @Date: 8/9/2022 4:31 PM
 */
public class Node {
    Integer val;
    Node next;
    Node head;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public Node() {
    }

    public void addFirst(int val) {
        Node newNode = new Node();
        newNode.val = val;
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
}
