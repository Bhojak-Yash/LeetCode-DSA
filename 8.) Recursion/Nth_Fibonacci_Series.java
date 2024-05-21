public class Nth_Fibonacci_Series {

  public static int fib(int n) {
    if (n <= 1) {
      return n;
    }
    return fib(n - 1) + fib(n - 2);
  }

  public static void print(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(" " + fib(i));
    }
  }

  public static void main(String[] args) {
    int n = 3;
    print(n);
	
  }
}
