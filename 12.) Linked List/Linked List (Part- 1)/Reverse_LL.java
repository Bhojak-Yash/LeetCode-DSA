public class Reverse_LL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Add the element at the first...
    public void add_First(int data) {
        Node temp = new Node(data); //Step-1
        size++;
        if (head == null) {
            head = tail = temp;
            return;
        }
        temp.next = head; //Step-2
        head = temp; //Step-3
    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        Reverse_LL ll = new Reverse_LL();

        ll.add_First(5);
        ll.add_First(4);
        ll.add_First(3);
        ll.add_First(2);
        ll.add_First(1);
        ll.print();

        System.out.println("\nReversed LL : ");
        ll.reverse();
        ll.print();        
    }
}