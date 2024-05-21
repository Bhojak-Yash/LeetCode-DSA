import java.util.*;
public class Bubble_Sort {
  //We push the largest element in last
  
  public static void bubble_Sort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if (arr[i] > arr[j]) { //use < for finding Descending Order...
          //swap
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 5, 4, 1, 3, 2 };
    bubble_Sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
