import java.util.*;

public class Merge_Sort_On_LL {

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

  //...............................................................................................
  public Node getMid(Node head) {
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow; //mid node
  }

  public Node merge(Node head1, Node head2) {
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
      } else {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }
    }

    while (head1 != null) {
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
    }
    while (head2 != null) {
      temp.next = head2;
      head2 = head2.next;
      temp = temp.next;
    }
    return mergedLL.next;
  }

  public Node mergeSort(Node head) {
    if (head == null || head.next == null) {
      return head;
    }
    //find mid
    Node mid = getMid(head);

    //left & right MS
    Node rightHead = mid.next;
    mid.next = null;
    Node new_Left = mergeSort(head);
    Node new_Right = mergeSort(rightHead);

    //merge
    return merge(new_Left, new_Right);
  }

  //...............................................................................................
  public static void main(String[] args) {
    Merge_Sort_On_LL ll = new Merge_Sort_On_LL();
    ll.add_First(6);
    ll.add_First(5);
    ll.add_First(3);
    ll.add_First(2);
    ll.add_First(4);
    ll.print();
    head = ll.mergeSort(head);
    ll.print();
  }
}