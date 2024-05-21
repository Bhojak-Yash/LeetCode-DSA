
public class Palindrome {
	public static boolean print(String str) {
		int n = str.length();
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i) == str.charAt(n-i-1)) {
				System.out.print("Is Palindrome");
				return true;
			}
		}
		System.out.println("Not Palindrome");
		return false;
	}
	public static void main(String [] args) {
		String str = "racecar";
		print(str);
	}
}
