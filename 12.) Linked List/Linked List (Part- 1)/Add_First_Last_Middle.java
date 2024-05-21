public class Add_First_Last_Middle {
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

    //Add the element at the last...
    public void add_Last(int data){
        Node temp = new Node(data); // Step-1
        size++;
        if(head == null){
            head = tail = temp;
            return;
        }
        tail.next = temp; // Step-2
        tail = temp; // Step-3
    }

    //Add in the Middle... 
    public void add(int index, int data){
        Node newNode = new Node(data); //New Node is created, which is to be inserted.
        size++;
        Node temp = head;
        int i=0;

        while(i < index-1){ //Index-1 = temp is pointing the previous node of where we'll insert.
            temp = temp.next;
            i++;
        }
        //When i = index-1;  temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
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

    public static void main(String[] args) {
        Add_First_Last_Middle ll = new Add_First_Last_Middle();
        ll.print();
        ll.add_First(2);
        ll.print();
        ll.add_First(1);
        ll.print();
        ll.add_Last(3);
        ll.print();
        ll.add_Last(4);
        ll.print();
        ll.add(2, 9);
        ll.print();
        
        System.out.println(ll.size);
    }
}