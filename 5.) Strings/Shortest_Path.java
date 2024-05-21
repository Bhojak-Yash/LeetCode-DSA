public class Shortest_Path {
	public static float print(String str) {
		int x = 0;
		int y = 0;
		
		for(int i=0; i<str.length(); i++) {
			char dir = str.charAt(i);
			
			//East...
			if(dir == 'E') {
				x++;
			}
			//West...
			else if(dir == 'W') {
				x--;
			}
			//North...
			else if(dir == 'N') {
				y++;
			}
			//South...
			else if(dir == 'S') {
				y--;
			}
		}
		int X2 = x*x;
		int Y2 = y*y;
		return (float)Math.sqrt(X2 + Y2);
	}
	public static void main(String[] args) {
		String str = "WNEENESENNN";
	    System.out.println(print(str));;
	}
}