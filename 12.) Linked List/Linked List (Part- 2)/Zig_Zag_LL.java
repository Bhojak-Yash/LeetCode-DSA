import java.util.*;

public class Zig_Zag_LL {

  public class Node {

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

  public void print() {
    if (head == null) {
      System.out.println("LL is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  //.....................................................................................................
  public void Zig_Zag() {
    //find mid..
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    Node mid = slow;

    //reverse 2nd half..
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    Node LH = head;
    Node RH = prev;
    Node nextL, nextR;

    //alternate merging..
    while (LH != null && RH != null) {
      nextL = LH.next;
      LH.next = RH;
      nextR = RH.next;
      RH.next = nextL;

      LH = nextL;
      RH = nextR;
    }
  }
  //.....................................................................................................
  public static void main(String[] args) {
    Zig_Zag_LL ll = new Zig_Zag_LL();
    ll.add_First(5);
    ll.add_First(4);
    ll.add_First(3);
    ll.add_First(2);
    ll.add_First(1);
    ll.print();
    ll.Zig_Zag();
    ll.print();
  }
}
