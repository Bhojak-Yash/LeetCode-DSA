import java.util.*;
public class Merge_Sort {

  public static void sort(int arr[], int si, int ei) {
    //base
    if (si >= ei) return;
    //kaam
    int mid = (si + ei) / 2;

    sort(arr, si, mid); //left...
    sort(arr, mid + 1, ei); //right...
    merge(arr, si, mid, ei);
  }

  public static void merge(int arr[], int si, int mid, int ei) {
    int temp[] = new int[ei - si + 1]; 
    int i = si; //iterator for left part
    int j = mid + 1; // itertor for right part
    int k = 0; // iterator for temp arr

    while (i <= mid && j <= ei) {
      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }

    //left part
    while (i <= mid) {
      temp[k++] = arr[i++];
    }

    //right part
    while (j <= ei) {
      temp[k++] = arr[j++];
    }
    //copy temp to my original arr
    for (k = 0, i = si; k < temp.length; k++, i++) {
      arr[i] = temp[k];
    }
  }

  public static void main(String[] args) {
    int arr[] = { 6, 3, 9, 5, 2, 8, -2 };
    sort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }
}