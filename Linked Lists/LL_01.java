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

public class LL_01 {
    private static Node convertArr(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =1;i<arr.length;i++){
            mover.next = new Node(arr[i]);
            mover = mover.next;
        }
        return head;
    }
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = convertArr(arr);
        Node temp = head;

        int count=  0;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            count++;
        }

        System.out.println("The length of LL is : " + count);


    }
}