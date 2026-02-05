
class CLL {
    private Node head;
    private Node tail;

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    // insert
    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    // delete
    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }
        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    // display
    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next;

            } while (node != head);
            System.out.println("HEAD");
        }
    }

}

public class CustomCLL {
    public static void main(String[] args) {
        CLL cl = new CLL();
        cl.insert(1);
        cl.insert(2);
        cl.insert(3);
        cl.insert(4);
        cl.insert(5);

        cl.delete(5);
        cl.display();
    }
}
