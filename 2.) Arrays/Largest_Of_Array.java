import java.util.*;

public class Largest_Of_Array {

	public static int Largest_NO(int arr[]) {
		int largest = Integer.MIN_VALUE; // -infinity
		int smallest = Integer.MAX_VALUE; // +infinity

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest no : " + smallest);
		System.out.print("Largest no : ");
		return largest;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 0,3,6,8 };
		
		int max = Largest_NO(arr);
		System.out.println(max);
	}
}