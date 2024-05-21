public class Removing_First_Last {
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

    //Remove from First...
    public int remove_First(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //Remove from Last...
    public int remove_Last(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        //prev : i = size-2;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data;
        prev.next = null;
        prev = tail;
        size--;
        return val;
    }

    //Printing the LL
    public void print(){
        if(head == null){
            System.out.println("\nLL is empty");
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
        Removing_First_Last ll = new Removing_First_Last();

        ll.add_First(5);
        ll.add_First(4);
        ll.add_First(3);
        ll.add_First(2);
        ll.add_First(1);
        ll.print();
        
        System.out.println( "Size = " + ll.size);

        System.out.println("\nAfter Removing the Firts element...");
        ll.remove_First();
        ll.print();
        System.out.println("Size = " + ll.size);
        
        System.out.println("\nAfter Removing the Last element...");
        ll.remove_Last();
        ll.print();
        System.out.println("Size = " + ll.size);
    }
}