public class Power_of_Four {

  public static boolean power(int n) {
    if (n <= 0) {
      return false;
    }
    double log = Math.log(n) / Math.log(4);
    return Math.floor(log) == log;
  }

  public static void main(String[] args) {
    int n = 16;
    if (power(n)) {
      System.out.println("Is power of 4");
    } else {
      System.out.println("Not power of 4");
    }
  }
}
