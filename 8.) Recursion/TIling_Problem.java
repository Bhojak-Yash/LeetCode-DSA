public class TIling_Problem {
    

	public static int tilingProb(int n) { // 2 x n (floor size)...
		// Base Case...
		if(n == 0 || n == 1) {
			return 1;
		}
		
		// Kaam...
		//Vertical Choice
		int vc = tilingProb(n-1);

		//Horizontal Choice
		int hc = tilingProb(n-2);
		
		int ways = vc + hc;
		return ways;
		
	}

	public static void main(String[] args) {
		System.out.println(tilingProb(4));
	}
}