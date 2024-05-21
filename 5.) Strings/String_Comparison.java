
public class String_Comparison {
	public static void main(String[] args) {
		String S1 = "Tony";
		String S2 = "Tony";
		String S3 = new String("Tony");
		//Comparison of S1 & S2...
		if(S1 == S2) {
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}
		
		//Comparison of S1 & S3...
		if(S1 == S3) {
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}
		
		//To Compare content of S1 and S3 we use this code... 
		if(S1.equals(S3)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}
 	}
}
