public class Duplicate_Removal {
	public static void dup(String str, int index, StringBuilder newStr, boolean map[]) {
		if(index == str.length()) {
			System.out.println("\n"+ newStr + "\n");
			return;
		}
		
		//kaam
		char currChar = str.charAt(index);
		if(map[currChar - 'a'] == true) {
			//duplicate...
			dup(str, index+1, newStr, map);
		}else {
			map[currChar-'a'] = true;
			dup(str, index+1, newStr.append(currChar), map);
		}
	}
	
	public static void main(String[] args) {
		String str = "apnnacollege";
		dup(str, 0, new StringBuilder(""), new boolean [26]);
	}
}
