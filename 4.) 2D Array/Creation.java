import java.util.*;

public class Creation {
	public static void print(int arr[][] , int key) {
		for(int i=0; i<3 ; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == key ) {
					System.out.println("Found at the position : " + i + "," + j);
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int [3][3];
		
		//input...
		for(int i=0; i<3 ; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		//printing...
		for(int i=0; i<3 ; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		print(arr , 5);
		
	}
}