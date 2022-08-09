package linkedlist;

/**
 * @Author: Jialei Liu
 * @Date: 8/9/2022 4:46 PM
 */
public class NodeTest {
    public static void main(String[] args) {
        Node node2 = new Node(2, null);
        Node node1 = new Node(1, node2);
        Node node = new Node(0, node1);
        node.head = node;
        node.addFirst(3);
        traverseNode(node);
    }

    //遍历
    public static void traverseNode(Node node){
        Node cur = node;
        while (cur!=null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

}
