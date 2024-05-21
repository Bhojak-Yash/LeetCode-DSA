
public class Counting_Set_Bits {
	public static int counting(int n) {
		int count = 0;
		while(n > 0) {
			if((n&1) != 0) {
				count++;
			}
			n = n>>1;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(counting(10));
	}
}
