import java.util.*;
public class Selection_Sort {
  //Chote element ko aage laye..

  public static void selectionSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      int min_idx = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min_idx]) {
          min_idx = j;
        }
        int temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 5, 4, 1, 3, 2 };
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}