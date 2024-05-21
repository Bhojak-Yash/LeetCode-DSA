
import java.util.*;
public class Prime_Or_Not {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		boolean isprime = true;
		
		for (int i=2; i<n ; i++) {
			if(n%i == 0) {
				isprime = false;
			}
		}
		
		if(isprime == true) {
			System.out.println("Prime");
		}else {
			System.out.println("Non Prime");
		}
		
		
	}
}
