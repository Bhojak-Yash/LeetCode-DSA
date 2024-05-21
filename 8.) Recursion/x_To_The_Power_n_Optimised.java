public class x_To_The_Power_n_Optimised {

	public static int opt(int x, int n) {
		if(n == 0) {
			return 1;
		}
		int a = opt(x, n/2);
		int hps = a * a;

		//n is odd
		if(n%2 == 1) {
			hps = x * hps;
		}
		return hps;
	}
	
	public static void main(String[] args) {
		int x = 2, n = 5;
		System.out.println(opt(x, n));
	}
}