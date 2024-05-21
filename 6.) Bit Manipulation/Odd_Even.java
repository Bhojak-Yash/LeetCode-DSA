
public class Odd_Even {
	public static void odd_even(int n) {
		int bitmask = 1;	//no. jisse divide krna h...
		
		if((n & bitmask) == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
		
	public static void main(String[] args) {
		odd_even(3);
		odd_even(4);
		odd_even(11);
	}	
}
