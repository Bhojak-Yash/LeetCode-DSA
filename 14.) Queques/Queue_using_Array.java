public class Queue_using_Array {
  static class Queue {
      private int[] arr;
      private int size;
      private int rear;
      private int front;

      // Constructor
      public Queue(int n) {
          arr = new int[n];
          size = n;
          rear = front = -1;
      }
      public boolean isEmpty() {
          return front == -1;
      }

      public boolean isFull() {
          return (rear + 1) % size == front;
      }

      // Add element to the queue
      public void add(int data) {
          if (isFull()) {
              System.out.println("Queue is full");
              return;
          }
          if (isEmpty()) {
              front = 0; // Update front pointer if queue is empty
          }
          rear = (rear + 1) % size;
          arr[rear] = data;
      }
      // Remove element from the queue
      public int remove() {
          if (isEmpty()) {
              System.out.println("Empty Queue");
              return -1;
          }

          int result = arr[front];
          if (front == rear) {
              // If there's only one element in the queue
              front = rear = -1;
          } else {
              front = (front + 1) % size;
          }
          return result;
      }
      // Peek at the front element of the queue
      public int peek() {
          if (isEmpty()) {
              System.out.println("Empty Queue");
              return -1;
          }
          return arr[front];
      }
  }
  public static void main(String[] args) {
      Queue q = new Queue(5);
      q.add(1);
      q.add(2);
      q.add(3);
      q.remove();
      q.add(4);
      q.remove();
      q.add(5);

      while (!q.isEmpty()) {
          System.out.println(q.peek());
          q.remove();
      }
  }
}
