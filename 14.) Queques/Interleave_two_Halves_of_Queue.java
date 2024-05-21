import java.util.*;

public class Interleave_two_Halves_of_Queue {

  public static void interleave(Queue<Integer> q) {
    Queue<Integer> first_half = new LinkedList<>();

    int n = q.size();

    for (int i = 0; i < n/2; i++) {
      first_half.add(q.remove());
    }
    while (!first_half.isEmpty()) {
      q.add(first_half.remove());
      q.add(q.remove());
    }
  }

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    q.add(7);
    q.add(8);
    q.add(9);
    q.add(10);

    interleave(q);
    //printing queue
    System.out.println(q);
  }
}
