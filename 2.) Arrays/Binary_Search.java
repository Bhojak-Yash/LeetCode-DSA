public class Binary_Search {

  public static int binary_search(int arr[], int key) {
    int start = 0, end = arr.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (arr[mid] == key) { //found
        return mid;
      }
      if (arr[mid] < key) { //Right
        start = mid + 1;
      } else { //left
        end = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    int key = 4;

    int index = binary_search(arr, key);
    System.out.println("Index of no. is : " + index);
  }
}