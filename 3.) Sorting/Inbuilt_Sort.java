import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_Sort {
	public static void main(String[] args) {
		int arr[] = {5,4,1,3,2};
		
		System.out.println("Ascending Order");
		Arrays.sort(arr);
		//Arrays.sort(arr,0,3);
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("\nDescending Order");
		Integer pop[] = {5,4,1,3,2};
		Arrays.sort(pop,Collections.reverseOrder());
		//Arrays.sort(pop,0,3,Collections.reverseOrder());
		for(int i=0 ; i<pop.length ; i++) {
			System.out.print(pop[i] + " ");
		}
	}
}
