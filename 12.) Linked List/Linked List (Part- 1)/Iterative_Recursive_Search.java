public class Iterative_Recursive_Search {
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

    //Iterative Search a in LL...
    public int Search(int key){
        Node temp = head;
        int i=0;
        while(temp!= null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        //If Key not found..
        return -1;
    }

    //Recursive Search in a LL...
    public int RecSearch(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index = RecSearch(head.next, key);
        if(index == -1){
            return -1;
        }

        return index + 1;
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
        Iterative_Recursive_Search ll = new Iterative_Recursive_Search();

        ll.add_First(5);
        ll.add_First(4);
        ll.add_First(3);
        ll.add_First(2);
        ll.add_First(1);
        ll.print();

        System.out.println("\nIterative Seaech = " + ll.Search(4));
        System.out.println("Recursive Search = " + ll.RecSearch(head,4 ));
    }
}