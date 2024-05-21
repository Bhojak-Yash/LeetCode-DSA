public class String_Substring {	
	public static String print(String str, int si, int ei) {
		String subString = "";
		for(int i=si; i<ei; i++) {
			subString += str.charAt(i);
		}
		return subString;
	}
	public static void main(String[] args) {
		String str = "HelloWorld";
		System.out.println(print(str, 0, 5));
					//OR
		//Inbuilt substring function in java...
				String c = str.substring(0,5);
		System.out.println(c);
	}
}