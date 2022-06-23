public class Node {
    public int value;
    public Node next;

    Node(int value) {
        this.value = value;
        next = null;
    }

    public static Node reverseLinkedList(Node head) {
        Node curr = head;
        Node prev = null;
        Node nextNode = null;

        while(curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public static String toString(Node head) {
        Node curr = head;
        String concat = "";

        while(curr != null) {
            concat += curr.value + " -> ";
            curr = curr.next;
        }
        return concat;
    }

    private void setNext(Node node) {
        this.next = node;
    }
}

class main {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(7);
        Node n3 = new Node(18);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.println(Node.toString(n1));

        Node reversed = Node.reverseLinkedList(n1);

        System.out.println(Node.toString(reversed));

    }
}
