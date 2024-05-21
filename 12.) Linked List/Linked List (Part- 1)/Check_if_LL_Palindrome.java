public class Check_if_LL_Palindrome {
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
    //Finding Mid value using Turtle & Hare technique...
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //Slow is our Mid.
    }

    public boolean checkPalindrome(){
        if(head == null || head.next ==  null){
            return true;
        }
        //Step -1 Find mid
        Node mid = findMid(head);

        //Step -2 Reverse LL
        Node prev = null;
        Node curr = mid;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //Rigth half head.
        Node left = head; //Left half head.

        //Step -3 Check Left half & Right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


    public static void main(String[] args) {
        Check_if_LL_Palindrome ll = new Check_if_LL_Palindrome();
        ll.add_First(1);
        ll.add_First(2);
        ll.add_First(3);
        ll.add_First(2);
        ll.add_First(1);
        ll.print();

        System.out.println(ll.checkPalindrome());
    }
}