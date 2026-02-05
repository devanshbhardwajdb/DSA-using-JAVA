class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LL_02 {
    private static Node convertArr(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            mover.next = new Node(arr[i]);
            mover = mover.next;
        }
        return head;
    }

    private static Node insertAtStart(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;

    }

    private static Node deleteNode(Node head, int key) {
        Node temp = head;

        while (temp != null && temp.next != null) {
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = convertArr(arr);
        Node temp = head;

        int count = 0;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            count++;
        }

        System.out.println("The length of LL is : " + count);

        head = insertAtStart(head, 44);
        temp = head;
        System.out.println("After inserting at start:");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }
        head = deleteNode(head, 3);
        temp = head;
        System.out.println("After deleting node with key 3:");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }
    }
}