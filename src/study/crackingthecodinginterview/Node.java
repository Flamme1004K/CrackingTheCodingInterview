package study.crackingthecodinginterview;

public class Node {

    Node next = null;
    int data;
    public Node(int d) {
        data = d;
    }

    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this; //head 노드를 참조.
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    Node deleteNode(Node head, int d) {
        Node n = head;
        if(n.data == d) {
            System.out.println("n = " + n);
            return head.next;
        }

        while (n.next != null) {
            if(n.next.data == d) {
                n.next = n.next.next; //.next가 줄줄이 이어져있는 상황인가?
                return head;
            }
            n = n.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node node = new Node(5);
        node.appendToTail(3);
        node.appendToTail(4);
        node.appendToTail(6);
        node.appendToTail(7);
        System.out.println("node = " + node);
        System.out.println("node.next = " + node.next);
        System.out.println("node.next.next = " + node.next.next);
        System.out.println("node.next.next.next = " + node.next.next.next);
        System.out.println("node.next.next.next.next = " + node.next.next.next.next);


        node.deleteNode(node, 4);
        System.out.println("node = " + node);
        System.out.println("node.next = " + node.next);
        System.out.println("node.next.next = " + node.next.next);
        System.out.println("node.next.next.next = " + node.next.next.next);
        System.out.println("node.next.next.next.next = " + node.next.next.next.next);
    }

}
