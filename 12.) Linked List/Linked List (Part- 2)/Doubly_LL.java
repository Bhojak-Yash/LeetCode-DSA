import java.util.*;

public class Doubly_LL {

  public class Node {

    Node prev;
    int data;
    Node next;

    public Node(int data) {
      this.prev = null;
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "<->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  //adding 1st Node in DLL
  public void add_First(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
  }

  //removing 1st Node in DLL
  public void remove_First(int data) {
    Node temp = new Node(data);
    if (head == null) {
      System.out.println("DLL is empty");
    }
    head = head.next;
    head.prev = null;
  }

  //reversng a Dll
  public void reverse(int data) {
    Node curr = head;
    Node prev = null;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      curr.prev = next;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public static void main(String[] args) {
    Doubly_LL dll = new Doubly_LL();
    dll.add_First(3);
    dll.add_First(2);
    dll.add_First(1);
    dll.print();
    dll.reverse(0);
    dll.print();
    dll.remove_First(0);
    dll.print();
  }
}
