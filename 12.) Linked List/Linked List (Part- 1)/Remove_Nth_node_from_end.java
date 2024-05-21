public class Remove_Nth_node_from_end {
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

    public void add_First(int data) {
        Node temp = new Node(data); //Step-1
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

    public void delete_Nth_from_end(int n){
        //Calculating size...
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        //corner case...
        if(n == size){
            head = head.next;// remove 1st.
            return;
        }

        //size-n
        int idx = 1;
        int idx_To_Find = size-n;
        Node prev = head;
        while(idx < idx_To_Find){
            prev = prev.next;
            idx++;
        }

        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        Remove_Nth_node_from_end ll = new Remove_Nth_node_from_end();

        ll.add_First(5);
        ll.add_First(4);
        ll.add_First(3);
        ll.add_First(2);
        ll.add_First(1);
        ll.print();

        ll.delete_Nth_from_end(3);
        ll.print();
    }
}